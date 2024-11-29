public class PeopleTest {
    public static void main(String []args){
        // Crear un objeto People mediante constructor
        People people = new People();

        // Debido a que el atributo es privado, no se puede acceder directamente
        people.name = "cleymer"; // Error en compilacion: The field People.name is not visible
        System.out.println(people.name); // Error en compilacion: The field People.name is not visible
    }
}
