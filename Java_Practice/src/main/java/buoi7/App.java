package buoi7;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        HocVien hv1 = new HocVien(); //hv1 => object/ đối tượng
        /*Gán thông tin cho những thuộc tính của hv1*/
        hv1.idHocVien = "HV001";
        hv1.tenHocVien = "Học Viên Một";
        hv1.ngaySinh = new Date(100,10,01);
        hv1.hocPhi = 10000000;

        /*sử dụng những chức năng bên trong class HocVien cung cấp
        *để  thực hiện cho hv1*/
        System.out.println(hv1.tinhTuoi());
        hv1.themHocVienMoi();

        HocVien hv2 = new HocVien("HV002","Học Viên 2",new Date(100,10,01),12000000);

        System.out.println(hv2.toString()); // HV002---Học Viên 2---2000/10/01---12000000

    }
}
