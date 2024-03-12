package strategy.exercises_strategy.dance;

public class Fail implements Pirouette {
    @Override
    public int perform(boolean isSkilled) {
        return !isSkilled ? -1 : 1;
    }
}
