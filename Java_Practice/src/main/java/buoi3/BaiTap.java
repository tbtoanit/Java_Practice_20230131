package buoi3;

public class BaiTap {

    public static void main(String[] args) {
        inPhanTuChan();
    }

    public static void tinhTong() {
        /*
         * Khai báo 1 mảng gồm nhiều phần tử số nguyên, sau đó tính tổng tất cả các giá trị trong mảng đó
         * Ví dụ: input a = {1,5,1,1,2} => output tong = 10
         * */
        int[] a = {1, 5, 1, 1, 2, 6};
        int tong = 0;

        for (int i = 0; i < a.length; i++) {
            tong += a[i];
        }

        System.out.println(tong);
    }

    public static void inPhanTuChan(){
        /*
        * In ra tất cả các phần tử là số chẵn trong mảng số nguyên cho trước
        * Ví dụ: input a = {1,5,1,4,2} => output la: 4, 2
        * */
        int[] a = {1,5,1,4,2};
        for (int i=0; i<a.length; i++){
            if(a[i] % 2 == 0){
                System.out.println(a[i]);
            }
        }
    }

    public static void timSoLonNhat(){
        /*
        * Tìm số lớn nhất trong danh sách số nguyên
        * ví dụ:
        * input int[] a = {1,5,1,4,2};
        * output 5
        * */
        int[] a = {1,5,1,4,2};
        int maxNumber = a[0];
    }

}
