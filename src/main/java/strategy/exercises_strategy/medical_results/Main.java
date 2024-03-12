package strategy.exercises_strategy.medical_results;

public class Main {

    public static void main(String[] args) {
        Patient healthyPatient = new Patient(new Standard());
        Patient sickPatient = new Patient(new High());
        Patient warnPatient = new Patient(new Increased());

        healthyPatient.getBloodResults();
        sickPatient.getBloodResults();
        warnPatient.getBloodResults();
    }
}