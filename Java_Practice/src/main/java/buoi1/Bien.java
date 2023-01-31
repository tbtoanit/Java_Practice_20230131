package buoi1;

public class Bien {
    int myGlobalVar = 100; //biến toàn cục được khai báo bên ngoài tất cả các hàm
    final static float pi = 3.14f; //khai báo hằng số
    static int myStaticVar = 1000; //biến static, biến tĩnh
    public static void main(String[] args) {
        //Biến cục bộ, bởi vì được khai báo trong hàm main
        int x = 10; //khai báo biến x = 10, lưu trữ trong bộ nhớ trong RAM
        int y = 20;
        int z = x+y;
        myFunction();
        System.out.println(z);
        //Bien.pi = 3.15; // hằng số không thể thay đổi
        Bien.myStaticVar = 2000;
        //cách truy xuất biến instance/global
        Bien b1= new Bien();
        b1.myGlobalVar = 20;
        System.out.println(b1.myGlobalVar);

        //Cách truy xuất biến tĩnh/static
        System.out.println(Bien.myStaticVar);
        myFunction(); // gọi/call hàm myFunction()
    }

    public static void myFunction(){
        char kyTuCuaToi = 'T'; // khai báo biến có kiểu dữ liệu(data type) là char
        System.out.println(kyTuCuaToi);

        boolean lopJavaPhaiKhong = true;
        boolean lopPythonPhaiKhong = false;

        // Kiểu dữ liệu array
        int[] dsSN = {1,2,4,6,7};
        char[] dsKT = {'c','h','a'};

        System.out.println(dsSN[4]);
    }

}
