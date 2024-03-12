package decorator;

public class FaceWithFluid extends Face {

    private Face face;

    public FaceWithFluid(Face face) {
        this.face = face;
    }

    @Override
    public void look() {
        System.out.println("Added fluid");
        face.look();
    }
}
