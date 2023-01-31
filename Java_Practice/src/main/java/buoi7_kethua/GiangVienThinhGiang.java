package buoi7_kethua;

public class GiangVienThinhGiang extends GiangVien{
    int bonus;
//    public void inThongTinGiangVien(){
//        System.out.println(maGiangVien+"---1"+tenGiangVien+"---"+luong);
//    }
    public float tinhThue(){
        return (luong+bonus)*0.1f;
    }

}
