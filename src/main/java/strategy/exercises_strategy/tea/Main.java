package strategy.exercises_strategy.tea;

public class Main {

    public static void main(String[] args) {
        Shop blackTea = new Shop(new BlackTea());
        Shop whiteTea = new Shop(new WhiteTea());
        Shop greenTea = new Shop(new GreenTea());

        System.out.println(blackTea.makeTea());
        System.out.println(whiteTea.makeTea());
        System.out.println(greenTea.makeTea());
    }
}
