package buoi5;

import java.util.Scanner;

public class VongLapWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 'yes' nếu bạn muốn thoát chương trình: ");
        String existFlag = "no";

//        while(true){
//            existFlag = sc.nextLine();
//            System.out.println("Your business is in here!!");
//            if(existFlag.equals("yes")){
//                break;
//            }
//        }

        while(!existFlag.equals("yes")){ // khi thõa mãn điều kiện bên trong while thì vòng lặp while còn lặp
            existFlag = sc.nextLine();
            System.out.println("Your business is in here!!");
        }

        System.out.println("You already logged out!");

    }
}
