package buoi6;

public class Cat  extends Animal{

    public void eat(){
        System.out.print("Cat Eat!!!");
    }
    public static void main(String[] args) {
        Cat a = new Cat();
        a.eat();
    }

}
