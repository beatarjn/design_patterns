package decorator.exercises_decorator.hall;

public class ShowHall extends Hall {

    private Hall hall;

    public ShowHall(Hall hall) {
        this.hall = hall;
    }

    @Override
    public String hostShow() {
        return hall.hostShow() + "\n" + hostShowHall();
    }

    private String hostShowHall() {
        return "SHOWHALL host show";
    }
}
