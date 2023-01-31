package buoi8_truutuong;

public abstract class Animal {
    String kindOfAnimal;
    float animalAge;

    public Animal(){
    }

    public void animalEat(){
        System.out.println("How the animal eat!");
    }

    public abstract void animalSleep();
}
