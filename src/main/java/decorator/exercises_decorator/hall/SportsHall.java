package decorator.exercises_decorator.hall;

public class SportsHall extends Hall {

    private Hall hall;

    public SportsHall(Hall hall) {
        this.hall = hall;
    }

    @Override
    public String hostShow() {
        return hall.hostShow() + "\n" + hostSportsHall();
    }

    private String hostSportsHall() {
        return "SPORTSHALL host show";
    }
}
