package staticFactory;

public class StaticFactoryTest {

    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal animal = animalFactory.getAnimal("dog");
        animal.eat();
    }
}
