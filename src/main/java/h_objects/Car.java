package h_objects;

public class Car extends Vehicle {

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    private int doors;

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {

        if (horsePower<=0){
            System.out.println("Wartość nie może być niższa od 0");
        }
        else {
            this.horsePower = horsePower;
        }
    }

    private double horsePower;

    public Car(int doors, double horsePower) {
        this.doors = doors;
        this.horsePower = horsePower;
    }

}
