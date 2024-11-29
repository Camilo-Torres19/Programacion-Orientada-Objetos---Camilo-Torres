public class CarTest {
    public static void main(String []args){

        // Crear un objeto Car mediante constructor
        Car car = new Car("Honda", "Civic", 200);
        // Mostrar los datos del objeto por medio de los getters
        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getMaximunSpeed());;

        // Acceder a los datos por medio de las propiedades directamente // Errores que Lanzan en compilacion
        System.out.println(car.brand); // The field Car.brand is not visible
        System.out.println(car.model); // The field Car.model is not visible
        System.out.println(car.maximunSpeed); // The field Car.maximunSpeed is not visible

    }
}
