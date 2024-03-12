package strategy.exercises_strategy.hair;

public class Hair {

    private Shampoo shampoo;
    private int hairLength;

    public Hair(Shampoo shampoo) {
        this.shampoo = shampoo;
        this.hairLength = 10;
    }

    public void applyShampoo() {
        int lengthAfterShampoo = hairLength + shampoo.apply();
        System.out.println("Hair length after shampoo: " + lengthAfterShampoo);
        System.out.println("Hair longer by: " + shampoo.apply() + " cm");
    }
}
