package abastractFactort;

public class DogFactory implements  AnimalFactory {

    @Override
    public AnimalEat getAnimalEat() {
        return new DogEat();
    }

    @Override
    public AnimalColor getAnimalColor() {
        return new DogColor();
    }
}
