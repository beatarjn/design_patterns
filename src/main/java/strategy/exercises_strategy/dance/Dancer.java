package strategy.exercises_strategy.dance;

public class Dancer {

    private Pirouette pirouette;
    private boolean isSkilled;

    public Dancer(Pirouette pirouette, boolean isSkilled) {
        this.pirouette = pirouette;
        this.isSkilled = isSkilled;
    }

    public int dance(){
        return pirouette.perform(isSkilled);
    }
}
