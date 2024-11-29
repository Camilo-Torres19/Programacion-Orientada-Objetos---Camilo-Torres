public class Car {
    private String brand;
    private String model;
    private double maximunSpeed;

    public Car(String brand, String model, double maximumSpeed){
        this.brand = brand;
        this.model = model;

        // Verificar que la velocidad maxima no sea negativa
        if (maximumSpeed < 0) {
            this.maximunSpeed = 0.0;
        } else {
            this.maximunSpeed = maximumSpeed;
        }
    }

    public String getBrand(){
        return brand; 
    }

    public String getModel(){
        return model;
    }

    public double getMaximunSpeed(){
        return maximunSpeed;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setMaximunSpeed(double maximunSpeed){
        // Verificar que la velocidad maxima no sea negativa
        if (maximunSpeed < 0) {
            this.maximunSpeed = 0D;
        } else {
            this.maximunSpeed = maximunSpeed;
        }
    }


}
