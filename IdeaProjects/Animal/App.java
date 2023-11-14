import src.Animal;
import src.Dog;
import src.Swimable;

public class App {
    public static void main(String[] args) {
        Animal[] animal = new Animal[1];
        Swimable[] swimables = new Swimable[1];
        animal[0] = new Dog();
        swimables[0] = new Dog();
        for(int i = 0 ; i < animal.length  ;i++){
                animal[i].makesound();
                swimables[i].swim();
        }
    }
}
