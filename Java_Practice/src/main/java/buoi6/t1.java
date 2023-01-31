package buoi6;

public class t1 {
    int x = 10;
    public void calTotal(t1 a){
        a.x = 12;
        System.out.println(a.x);
    }

    public static void main(String[] args) {
        t1 a = new t1();
        a.calTotal(a);

    }

}
