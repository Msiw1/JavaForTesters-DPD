package h_objects;

public class App {
//    public static void main(String[] args) {
//        ElectricCar car2 = new ElectricCar();
//        car2.drive();
//    }

    public static void main(String[] args) {
        Car car1 = new Car(10, 22.0);
        Car car2 = new Car(10, 22.0);

        car1.setDoors(2);
        car2.setHorsePower(-100);
        System.out.println(car1.getDoors());
        System.out.println(car2.getHorsePower());


    }
}


