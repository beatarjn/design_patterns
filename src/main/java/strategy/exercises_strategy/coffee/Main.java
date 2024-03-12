package strategy.exercises_strategy.coffee;

public class Main {

    public static void main(String[] args) {
        Person sleepy = new Person(new Decaf());
        Person energetic = new Person(new BlackCoffee());
        Person tired = new Person(new WhiteCoffee());

        System.out.println("DECAF:");
        sleepy.drink();
        System.out.println("BLACK COFFEE:");
        energetic.drink();
        System.out.println("WHITE COFFEE:");
        tired.drink();
    }
}