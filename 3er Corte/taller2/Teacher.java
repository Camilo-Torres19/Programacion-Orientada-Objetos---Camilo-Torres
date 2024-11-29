public class Teacher {
    private String name;
    private int age;
    private Double averageGrade;

    public Teacher(){}

    public Teacher(String name, int age, Double averageGrade) {
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    /**
     *  A la hora de acceder a los datos de esta clase nos arrojara un error en compilacion
     *  ya que el atributo es privado y no se puede acceder directamente
     * 
     * mientras que solo se le puede asignar valores mediante el constructor
     * ya que no cuentan con los metodos setters y no se pueden alterar los datos fuera de la clase
     */
}
