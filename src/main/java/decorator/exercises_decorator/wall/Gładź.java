package decorator.exercises_decorator.wall;

public class Gładź extends Wall {

    private Wall wall;

    public Gładź(Wall wall) {
        this.wall = wall;
    }

    @Override
    public void create() {
        System.out.println("Add gładź");
        wall.create();
    }
}
