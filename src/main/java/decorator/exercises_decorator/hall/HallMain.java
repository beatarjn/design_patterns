package decorator.exercises_decorator.hall;

public class HallMain {

    public static void main(String[] args) {
        Hall hall = new Hall();
        ShowHall showHall = new ShowHall(new SportsHall(hall));
        System.out.println(showHall.hostShow());
    }
}
