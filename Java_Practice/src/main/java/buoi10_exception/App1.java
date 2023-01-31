package buoi10_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App1 {
    public static void main(String[] args) {
        //Check exception: FileNotFoundException
        try {
            FileInputStream fis = new FileInputStream("G:\\Personal\\IMIC\\IMIC\\Java_Core\\C11_Java\\Java_Practice\\src\\main\\java\\buoi10_exception\\test.txt");
        }catch (FileNotFoundException e){
        }
    }

    //throws: ném exception lên cho function gọi đến myFunction()
    public void myFunction() throws FileNotFoundException{
        FileInputStream fis = new FileInputStream("test.txt");
    }
}
