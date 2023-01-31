package buoi2;

import java.util.Scanner;

public class DescisionMakingDemo {
    public static void main(String[] args) {
        switchCaseDemo();
    }

    public static void ifDemo() {
        //String s = "imic java web";
        System.out.println("Nhập điểm số: ");

        Scanner sc = new Scanner(System.in);
        String diemSo = sc.nextLine();

        if (Integer.parseInt(diemSo) < 0 || Integer.parseInt(diemSo) > 10) {
            System.out.println("Nhập sai");
        } else {
            //ctrl+alt+l => cân chỉnh source code cho đẹp
            if (Integer.parseInt(diemSo) > 5) {// ham parseInt chuyển đổi chuỗi số sang số nguyên
                System.out.println("Đạt kết quả");
            } else if (Integer.parseInt(diemSo) == 5) {
                System.out.println("Vừa đạt kết quả");
            } else {
                System.out.println("Không đạt kết quả");
            }

        }
    }

    public static void switchCaseDemo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng chọn món\n1. Canh chua\n2. Phở\n3. Cá kho");
        String number = sc.nextLine();

        switch (Integer.parseInt(number)) {
            case 1:
                System.out.println("Bạn đã chọn món canh chua, vui lòng đợi trong giây lát");
                break;
            case 2:
                System.out.println("Bạn đã chọn phở, vui lòng đợi trong giây lát");
                break;
            case 3:
                System.out.println("Bạn đã chọn cá kho, vui lòng đợi trong giây lát");
                break;
            default:
                System.out.println("Bạn đã không chọn gì cả");
        }
    }

}
