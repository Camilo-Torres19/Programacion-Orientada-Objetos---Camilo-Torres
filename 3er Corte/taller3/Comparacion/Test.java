package Comparacion;

public class Test {
    public static void main(String []args){
        People p1 = new People("Jaime", 35);
        People p2 = new People("Jaime", 35);

        // Comparacion de atributos con modificadores de acceso por default y private
        // a la hora de mostrar en pantalla los atributos
        // por medio de los metods getName() y getAge() que son publicos 
        // No nos arroja error
        System.out.println(p1.getName());
        System.out.println(p1.getAge());

        // Mientras que si lo hacemos directamete en el atributo nombre nos arroja error
        // Ya que no es visible (private)
        System.out.println(p2.getName());

        // Mientras que si lo hacemos con la edad nos lo permite ya que es de paquete (default) su acceso 
        System.out.println(p2.age);


    }
}
