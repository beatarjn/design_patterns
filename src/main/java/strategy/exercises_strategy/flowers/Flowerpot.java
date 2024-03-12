package strategy.exercises_strategy.flowers;

public class Flowerpot {

    private Flower flower;

    public Flowerpot(Flower flower) {
        this.flower = flower;
    }

    public void bloomFlower(){
        System.out.println("In the pot: " );
        flower.bloom();
    }
}
