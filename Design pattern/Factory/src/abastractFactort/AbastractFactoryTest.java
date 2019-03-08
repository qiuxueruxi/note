package abastractFactort;

public class AbastractFactoryTest {

    public static void main(String[] args) {
        AnimalFactory animalFactory = new DogFactory();
        animalFactory.getAnimalEat().eat();
        animalFactory.getAnimalColor().color();

    }
}
