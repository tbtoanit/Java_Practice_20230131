package buoi7_kethua;

public class GiangVien implements IGiangVien {
    String maGiangVien;
    String tenGiangVien;
    int luong;

    public void inThongTinGiangVien(){
        System.out.println(maGiangVien+"---"+tenGiangVien+"---"+luong);
    }


    /*Hàm này viết với mục đích là abc....
    * */
    public void themGiangVien(){
        System.out.println("Viết code in thông tin giảng viên");
    }
    public void xoaGiangVien(){}
    public void timKiemGiangVien(){
        System.out.println("Viết code tìm kiếm thông tin giảng viên");
    }
}
