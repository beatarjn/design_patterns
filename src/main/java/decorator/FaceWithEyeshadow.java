package decorator;

public class FaceWithEyeshadow extends Face {

    private Face face;

    public FaceWithEyeshadow(Face face) {
        this.face = face;
    }

    @Override
    public void look() {
        System.out.println("Eyeshadow added");
        face.look();
    }
}
