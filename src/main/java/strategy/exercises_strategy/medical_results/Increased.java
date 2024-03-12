package strategy.exercises_strategy.medical_results;

public class Increased implements Result {
    @Override
    public void getResult() {
        System.out.println("Norma lekko podwyższona");
    }
}
