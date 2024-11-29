public class Vehicle {
    protected String brand;
    protected double maxSpeed;

    public Vehicle(String brand, double maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void showInfo() {
        System.out.println("Este es un vehículo de " + brand + " con un tope de velocidad de " + maxSpeed + " km/h");
    }

    public void move() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'move'");
    }

}


class Car extends Vehicle {
    private int numberOfDoors;
    private String color;
    public char[] model;
    public char[] maximunSpeed;

    public Car(String brand, double maxSpeed, int numberOfDoors, String color) {
        super(brand, maxSpeed);
        this.numberOfDoors = numberOfDoors;
        this.color = color;
    }

    public Car(String string, String string2, int i) {
        //TODO Auto-generated constructor stub
    }

    public Car(String string, String string2) {
        //TODO Auto-generated constructor stub
    }

    public Car() {
        //TODO Auto-generated constructor stub
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Tiene " + numberOfDoors + " puertas y es de color " + color);
    }

    public char[] getBrand() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBrand'");
    }

    public char[] getModel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getModel'");
    }

    public char[] getMaximunSpeed() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMaximunSpeed'");
    }

    public static char[] getNumCars() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNumCars'");
    }
}
