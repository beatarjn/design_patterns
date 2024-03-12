package strategy;

public class MaxMicrophone implements Microphone{
    @Override
    public void gatherSound() {
        System.out.println("MAX");
    }
}
