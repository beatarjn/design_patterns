package strategy.exercises_strategy.medical_results;

public class High implements Result {
    @Override
    public void getResult() {
        System.out.println("Pacjent wymaga szybkiej pomocy lekarskiej");
    }
}