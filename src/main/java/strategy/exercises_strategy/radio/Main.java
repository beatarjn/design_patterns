package strategy.exercises_strategy.radio;

public class Main {

    public static void main(String[] args) {
        Radio classic = new Radio(new Classic());
        Radio pop = new Radio(new Pop());
        Radio rock = new Radio(new Rock());
        Radio country = new Radio(new Country());

        System.out.println(classic.playMusic());
        System.out.println(pop.playMusic());
        System.out.println(rock.playMusic());
        System.out.println(country.playMusic());
    }
}
