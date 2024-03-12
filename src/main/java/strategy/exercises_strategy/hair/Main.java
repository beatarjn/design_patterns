package strategy.exercises_strategy.hair;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {
        Hair theLongestHair = new Hair(new FastGrowShampoo());
        Hair regularHair = new Hair(new NoGrowShampoo());
        Hair longerHair = new Hair(new SlowGrowShampoo());

        theLongestHair.applyShampoo();
        regularHair.applyShampoo();
        longerHair.applyShampoo();
    }

}