package buoi7_kethua;

public class App {
    public static void main(String[] args) {
        GiangVienThinhGiang gvtg1 = new GiangVienThinhGiang();
        gvtg1.maGiangVien = "GV01";
        gvtg1.tenGiangVien = "Nguyễn thị lụ";
        gvtg1.timKiemGiangVien();

        //bảo mật thông tin chi tiết nội dung của hàm bằng cách tạo dối tượng có kiểu dữ liệu là ITF
        IGiangVien igv = new GiangVienThinhGiang();
        igv.timKiemGiangVien();
    }
}
