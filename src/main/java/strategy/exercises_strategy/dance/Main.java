package strategy.exercises_strategy.dance;

public class Main {

    public static void main(String[] args) {
        Dancer skilledDancer = new Dancer(new Double(), true);
        Dancer unskilledDancer = new Dancer(new Fail(), false);
        Dancer dancer = new Dancer(new Single(), false);

        System.out.println("Skilled Dancer performs pirouette: " + skilledDancer.dance());
        System.out.println("Unskilled Dancer performs pirouette: " + unskilledDancer.dance());
        System.out.println("Dancer performs pirouette: " + dancer.dance());
    }
}