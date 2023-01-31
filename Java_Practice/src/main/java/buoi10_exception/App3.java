package buoi10_exception;

import java.io.FileNotFoundException;

public class App3 {
    public static void main(String[] args) {
        App1 a = new App1();
        try {
            a.myFunction();
        } catch (FileNotFoundException e1) {

        }
    }
}
