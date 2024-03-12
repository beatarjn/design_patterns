package decorator.exercises_decorator.wall;

public class WallMain {

    public static void main(String[] args) {
        Wall wall = new Wall();
        Gładź completeWall = new Gładź(new Gips(new Podkład(new Paint(wall, "beige"))));
        completeWall.create();
    }
}
