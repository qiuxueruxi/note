package FactoryMethod;

public class FactoryMethodTest {

    public static void main(String[] args) {
        AnimalFactory animalFactory = new DogFactory();
        animalFactory.getAnimal().eat();
    }
}
