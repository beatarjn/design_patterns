package strategy.exercises_strategy.expat;

public class Main {

    public static void main(String[] args) {
        Expat expatFoot = new Expat(new Foot());
        Expat expatCar = new Expat(new Car());
        Expat expatBike = new Expat(new Bike());
        Expat expatPlane = new Expat(new Plane());

        System.out.println(expatFoot.travelWith());
        System.out.println(expatCar.travelWith());
        System.out.println(expatBike.travelWith());
        System.out.println(expatPlane.travelWith());
    }
}
