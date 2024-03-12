package decorator.exercises_decorator.wall;

public class Gips extends Wall {

    private Wall wall;

    public Gips(Wall wall) {
        this.wall = wall;
    }

    @Override
    public void create() {
        System.out.println("Add gips");
        wall.create();
    }
}
