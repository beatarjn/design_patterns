package strategy.exercises_strategy.reading;

public class Main {

    public static void main(String[] args) {
        Reader fastReader = new Reader(new Fast());
        Reader slowReader = new Reader(new Slow());
        Reader normalReader = new Reader(new Normal());

        fastReader.readingSpeed();
        slowReader.readingSpeed();
        normalReader.readingSpeed();

    }
}