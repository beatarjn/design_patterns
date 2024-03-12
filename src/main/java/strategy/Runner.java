package strategy;

public class Runner {

    public static void main(String[] args) {
        Marketer marketer = new Marketer(new MaxMicrophone());
        marketer.makeCall();
    }
}
