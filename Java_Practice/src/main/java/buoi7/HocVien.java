package buoi7;

import java.util.Date;

public class HocVien {
    String idHocVien;
    String tenHocVien;
    Date ngaySinh;
    int hocPhi;

    public HocVien() {
        System.out.println("Bạn đã tạo ra 1 đối tượng");
    } // hàm tạo mặc định, default constructor

    //overload
    public HocVien(String idHocVien, String tenHocVien, Date ngaySinh, int hocPhi) { //hàm tạo có tham số
        this.idHocVien = idHocVien; // this là thể hiện của đối tượng bên trong class
        this.tenHocVien = tenHocVien;
        this.ngaySinh = ngaySinh;
        this.hocPhi = hocPhi;
    }

    public void themHocVienMoi() {
        System.out.println("Viết chức năng thêm học viên vào CSDL");
    }

    public int tinhTuoi() {
        Date currentDate = new Date(); // ngày hiện tại
        int age = currentDate.getYear() - this.ngaySinh.getYear(); //gạch ngang/bỏ có nghĩa là hàm này java sẽ loại trừ trong tương lai

        return age;
    }

    public String toString() {
        return this.idHocVien + "---" + this.tenHocVien + "---" + this.ngaySinh + "---" + this.hocPhi;
    }

}
