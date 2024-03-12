package decorator.exercises_decorator.wall;

public class Paint extends Wall {

    private Wall wall;
    private String color;

    public Paint(Wall wall, String color) {
        this.wall = wall;
        this.color = color;
    }

    @Override
    public void create() {
        System.out.println("Add " + color + " paint");
        wall.create();
    }
}
