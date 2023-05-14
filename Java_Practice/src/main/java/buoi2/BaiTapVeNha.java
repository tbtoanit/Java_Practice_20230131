package buoi2;

import java.util.Scanner;

public class BaiTapVeNha {
    public static void main(String[] args) {
        giaiPhuongTrinhBac2();
    }
    public static void giaiPhuongTrinhBac1(){
        //cho phương trình có dạng ax + b = 0, tìm và in ra x, biết rằng a và b được nhập từ Scanner
        Scanner sc = new Scanner(System.in);
        float a = Float.parseFloat(sc.nextLine());
        float b = Float.parseFloat(sc.nextLine());
        float x = -b/a;
        System.out.println("Nghiệm của phương trình bậc 1 với x là: "+ x);
        System.out.println("Chương trình đã thực hện xong - TRAN QUY");
    }

    public static void giaiPhuongTrinhBac2(){
        //ax^2 +bx + c = 0
        Scanner sc = new Scanner(System.in);
        float a = Float.parseFloat(sc.nextLine());
        float b = Float.parseFloat(sc.nextLine());
        float c = Float.parseFloat(sc.nextLine());

        double delta = b*b-4*a*c;
        if(delta < 0){
            System.out.println("Phương Trình Vô Nghiệm");
        } else if (delta == 0) {
            System.out.println("Phương trình nghiệm kép: " + (-b/(2*a)) );
        }else {
            delta = Math.sqrt(delta);
            System.out.println("Phương trình có 2 nghiệm phân biệt: "+  (-b+delta) / (2*a)  + " và " + (-b-delta) / (2*a)  );
        }
    }
}
