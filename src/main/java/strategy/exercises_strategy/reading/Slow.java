package strategy.exercises_strategy.reading;

public class Slow implements Pace {
    @Override
    public void speed() {
        System.out.println("SLOW");
    }
}
