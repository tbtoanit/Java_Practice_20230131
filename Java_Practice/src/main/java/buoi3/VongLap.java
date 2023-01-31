package buoi3;

public class VongLap {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if(i == 5){
                continue; // bỏ qua những câu lệnh bên dưới vòng lặp và quay lên vòng lặp thực hiện cho lần tiếp theo
            }

            System.out.println("Hello"); //nội dung của vòng lặp for
            System.out.println(i);
        }



    }
}
