package strategy.exercises_strategy.medical_results;

public class Standard implements Result {
    @Override
    public void getResult() {
        System.out.println("Wyniki zgodne z normą");
    }
}
