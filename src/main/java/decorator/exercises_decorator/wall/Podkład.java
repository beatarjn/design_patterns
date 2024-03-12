package decorator.exercises_decorator.wall;

public class Podkład extends Wall {

    private Wall wall;

    public Podkład(Wall wall) {
        this.wall = wall;
    }

    @Override
    public void create() {
        System.out.println("Add podkład");
        wall.create();
    }
}
