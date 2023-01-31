package buoi10_exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadFileText {
    public static void main(String[] args) {
        String data = readFile("G:\\Personal\\IMIC\\IMIC\\Java_Core\\C11_Java\\Java_Practice\\src\\main\\java\\buoi10_exception\\test.txt");
        writeFile("G:\\Personal\\IMIC\\IMIC\\Java_Core\\C11_Java\\Java_Practice\\src\\main\\java\\buoi10_exception\\test2.txt",data);

    }

    public static String readFile(String myPath) {
        String s = "";
        try {
            FileInputStream fis = new FileInputStream(myPath);
            int i = 0;

            while ((i = fis.read()) != -1) {
                s = s+ (char) i;
            }
        } catch (Exception e) {
            System.out.println(e.getCause());
        }

        return s;
    }

    public static void writeFile(String myPath, String data){ //data = "abcd"
        try {
            FileOutputStream fos = new FileOutputStream(myPath);
            char[] arrayData = data.toCharArray(); //arrayData = {'a','b','c','d'}
            for(char c:arrayData){
                fos.write((int)c);
            }

        }catch (Exception e){
            System.out.print(e.getCause());
        }
    }

}
