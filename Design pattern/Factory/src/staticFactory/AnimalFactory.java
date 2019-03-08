package staticFactory;

public class AnimalFactory {

    public Animal getAnimal(String type){
        switch (type){
            case "dog":
                return new Dog();
             default:
                 return null;
        }
    }
}
