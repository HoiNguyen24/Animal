package src;

public class Dog extends Animal implements Swimable{
    @Override
    public void makesound() {
        System.out.println("goud goud");
    }

    @Override
    public void swim() {
        System.out.println("biet boi");
    }
}
