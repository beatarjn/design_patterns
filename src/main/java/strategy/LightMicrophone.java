package strategy;

public class LightMicrophone implements Microphone{
    @Override
    public void gatherSound() {
        System.out.println("LIGHT");
    }
}
