package buoi2;

public class OperatorDemo {
    public static void main(String[] args) {
        operatorDemo();
    }

    public static void operatorDemo(){
        //Toán tử số học
        float number1 = 10;
        int number2 = 15;
        System.out.println(number1+number2);
        System.out.println(number1-number2);
        System.out.println(number1*number2);
        System.out.println(number1/number2);

        System.out.println(number2%number1); // toán tử chia lấy phần dư
        number2++; //toán tử tăng lên 1 giá trị
        System.out.println(number2);

        number2--; //giảm 1 giá trị
        System.out.println(number2);

        number2 += 4; //number2 = number2 + 4; tăng n giá trị
        System.out.println(number2);

        number2 -= 4; //number2 = number2 - 4; giảm n giá trị
        System.out.println(number2);

        number2 *= 4; //number2 = number2 * 4; nhân lên n giá trị
        System.out.println(number2);

        number2 /= 4; //number2 = number2 / 4; chia cho n giá trị
        System.out.println(number2);

        number2 %= 2; //number2 = number2%2; chia lấy phần dư với n
        System.out.println(number2);

        //Toán Tử quan hệ
        System.out.println(3==3);
        System.out.println(3!=3);
        System.out.println(3>=3);
        System.out.println(3<=3);
        System.out.println(3>3);
        System.out.println(3<3);

        //Toán tử logic
        if(number1 > 5 || number2 >5){
            System.out.println("Một trong 2 số lớn hơn 5");
        }

        if (number1 > 5 && number2 > 5){
            System.out.println("Cả 2 number 1 và number 2 đều lớn hơn 5");
        }else {
            System.out.println("Hiện tại không phải cả 2 number 1 và number 2 đều lớn hơn 5");
        }

        //toán tử điều kiện
        String ketQua = number1 > 0? "Number1 là số dương":"Number1 là số âm";
        System.out.println(ketQua);

    }

}
