package strategy.exercises_strategy.expat;

public class Expat {

    private Travel travel;

    public Expat(Travel travel) {
        this.travel = travel;
    }

    public String travelWith(){
        return travel.mode();
    }
}