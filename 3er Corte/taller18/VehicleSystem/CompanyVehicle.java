package VehicleSystem;

public class CompanyVehicle implements Driving, Carrying {

    @Override
    public void carry() {
        System.out.println("Cargando mercancías dentro del vehículo");
    }

    @Override
    public void drive() {
        System.out.println("El vehiculo se esta conduciendo");
    }
    
}
