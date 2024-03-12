package strategy.exercises_strategy.dance;

public class Double implements Pirouette {

    @Override
    public int perform(boolean isSkilled) {
        return isSkilled ? 2 : 1;
    }
}
