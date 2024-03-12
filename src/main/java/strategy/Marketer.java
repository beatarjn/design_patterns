package strategy;

public class Marketer {

    private Microphone microphone;

    public Marketer(Microphone microphone) {
        this.microphone = microphone;
    }

    public void makeCall(){
        microphone.gatherSound();
    }
}
