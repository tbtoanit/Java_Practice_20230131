package buoi2;

import java.util.Scanner;
import java.lang.Math;

public class TestBaiTram {
    public static void main(String[] args) {
        giaiPhuongTrinhBac2();

    }
    public static void giaiPhuongTrinhBac1(){
        //cho phương trình có dạng ax + b = 0, tìm và in ra x, biết rằng a và b được nhập từ Scaner
        Scanner sc = new Scanner(System.in);
        float a = Float.parseFloat(sc.nextLine());
        float b = Float.parseFloat(sc.nextLine());
        float x = -b/a;
        System.out.println("Nghiệm của phương trình bật 1 với x là:"+ x);
    }
    public static void giaiPhuongTrinhBac2(){
        //ax^2 +bx +c = 0, tìm và in ra x, biết rằng a, b, c được nhập từ Scaner
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập a");
        float a = Float.parseFloat(sc.nextLine());
        System.out.println("Vui lòng nhập b");
        float b = Float.parseFloat(sc.nextLine());
        System.out.println("Vui lòng nhập c");
        float c = Float.parseFloat(sc.nextLine());
        double x1 = 0;
        double x2 = 0;
        double delta = b*b - 4*a*c;
        //Biện luận
        if (a==0){
            System.out.println("Vui lòng nhập a khác 0");
        }else {
            if (delta<0){
                //delta <0
                System.out.println("Phương trình vô nghiệm");
            } else if (delta==0) {
                //delta = 0
                x1 = -b/(2*a);
                System.out.println("Phương trình có nghiệm kép x1 = x2="+x1);
            } else{
                //Delta >0
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có nghiệm");
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
            }
        }
    }
}