package Package;
public class Vehicle {
    public String brand;
    private String model;

    public Vehicle(String brand, String model){
        this.brand = brand;
        this.setModel(model);
    }

    public String getModel() {
        return model;
        
    }

    public void setModel(String model) {
        this.model = model;
        
    }
}
