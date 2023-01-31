package buoi8_tinhdonggoi;

public class App {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.getNumberlegs()); // we can read only, can not write

        d.setEyesCol("Black");
    }
}
