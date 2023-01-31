package buoi8_tinhdonggoi;

public class Dog extends Animal {
    private int numberlegs;
    private String colEyes;

    private void dogRun() {
        System.out.println("The dog runs with 10 km/h");
    }

    public int getNumberlegs() {
        return numberlegs;
    }

    public void setEyesCol(String p1) {
        colEyes = p1;
    }
}
