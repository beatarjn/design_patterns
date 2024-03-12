package strategy.exercises_strategy.reading;

public class Reader {

    private Pace pace;

    public Reader(Pace pace) {
        this.pace = pace;
    }

    public void readingSpeed(){
        System.out.println("Reading speed: ");
        pace.speed();
    }
}
