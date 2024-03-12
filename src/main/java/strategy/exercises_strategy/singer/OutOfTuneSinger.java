package strategy.exercises_strategy.singer;

public class OutOfTuneSinger implements Singer{
    @Override
    public void sing() {
        System.out.println("you'd better stop.");
    }
}
