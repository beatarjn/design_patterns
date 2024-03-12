package strategy.exercises_strategy.medical_results;

public class Patient {

    private Result result;

    public Patient(Result result) {
        this.result = result;
    }

    public void getBloodResults(){
        result.getResult();
    }
}