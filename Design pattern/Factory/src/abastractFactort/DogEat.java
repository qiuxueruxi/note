package abastractFactort;

public class DogEat implements AnimalEat {


    @Override
    public void eat() {
        System.out.println("狗要吃东西了");
    }
}
