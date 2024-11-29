public class StudentTest {
    public static void main(String[] args) {
        
        // Crear un objeto Student mediante constructor
        Student studen = new Student("Camilo", 21, 8.5);
        // Mostrar los datos del objeto por medio de los getters
        System.out.println(studen.getName());
        System.out.println(studen.getAge());
        System.out.println(studen.getAverageGrade());

        // Crear un objeto Student mediante constructor vacio
        Student student2 = new Student();
        // Asignando valores por medio de los setters
        student2.setName("cleymer");
        student2.setAge(19);
        student2.setAverageGrade(8.5);

        // Mostrar los datos del objeto por medio de los getters
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println(student2.getAverageGrade()); 

    }
}