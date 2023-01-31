package buoi10_exception;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 10;

        System.out.println("Muốn in ra phần tử thứ bao nhiêu?");

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //statement try/catch, khối
        try {
            System.out.println(a[i]); // đoạn code có khả năng xảy ra lỗi
            System.out.println(b / c);
        }
//        catch (ArrayIndexOutOfBoundsException e) { // định nghĩa lỗi có thể gặp
//            System.out.println("Lỗi index");
//            e.printStackTrace();
//        } catch (ArithmeticException e1) { // định nghĩa lỗi có thể gặp
//            System.out.println("Lỗi chia cho 0");
//        } catch (Exception ex) {//otherwise
//            System.out.println("Không thực thi được");
//        }
        finally {//đoạn code sẽ luôn được thực thi
            System.out.println("Thực hiện xong phép tính");
        }

        System.out.println("In thành công");
    }
}
