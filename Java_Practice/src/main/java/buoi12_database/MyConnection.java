package buoi12_database;

import java.sql.*;
import java.util.Scanner;

public class MyConnection {
    public static void main(String[] args) {

        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/QUAN_LY_THONG_TIN", "postgres", "123456");
            //conn.setAutoCommit(false);

            //Câu lệnh cho việc update/insert/delete
            Scanner sc = new Scanner(System.in);
            System.out.println("Bạn muốn cập nhật cho nhân viên có mã là gì?");
            String maNV = sc.nextLine();

            System.out.println("Bạn muốn cập nhật thành địa chỉ mới là gì?");
            String diaChi = sc.nextLine();
            String updateSQL = "UPDATE NHAN_VIEN SET DIA_CHI = '"+diaChi+"' WHERE MA_NHAN_VIEN = '"+maNV+"'";
            PreparedStatement st = conn.prepareStatement(updateSQL);
            st.execute();
            //conn.commit();
            System.out.println("Successfully Updated!!!");

            //

            // Câu lệnh cho select
            String selectNhanVien = "SELECT * FROM NHAN_VIEN";
            PreparedStatement st1 = conn.prepareStatement(selectNhanVien);
            ResultSet rs = st1.executeQuery();
            while (rs.next()) {
                String tenNhanVien = rs.getString("TEN_NHAN_VIEN");
                String diaChi1 = rs.getString("DIA_CHI");
                System.out.println(tenNhanVien + "---" + diaChi1);
            }


        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

    }
}
