package buoi5;

import java.util.Scanner;

public class VongLapDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 'yes' nếu bạn muốn thoát chương trình: ");
        String existFlag = "yes";

        do{// nội dung bên trong vòng lặp sẽ được thực thi ít nhất 1 lần
            existFlag = sc.nextLine();
            System.out.println("Your business is in here!!");
        }while(!existFlag.equals("yes"));


        System.out.println("You already logged out!");
    }
}
