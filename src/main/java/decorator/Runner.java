package decorator;

public class Runner {

    public static void main(String[] args) {
        Face face = new Face();
        Face faceWithMakeup = new FaceWithEyeshadow(new FaceWithFluid(face));
        faceWithMakeup.look();
    }
}