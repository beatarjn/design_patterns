package strategy;

public class MidMicrophone implements Microphone{
    @Override
    public void gatherSound() {
        System.out.println("MID");
    }
}
