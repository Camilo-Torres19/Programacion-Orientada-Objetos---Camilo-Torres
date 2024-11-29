public class People {
    protected String name;
    protected int age;

    public People(String name, int age){
        this.name = name;
        this.age = age;
    }

    public People() {
        //TODO Auto-generated constructor stub
    }

    public void showDetails(){
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
    }

    public void introduce() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'introduce'");
    }
}

class Employee extends People{
    private String department;

    public Employee(String name, int age, String department){
        super(name, age);
        this.department = department;
    }

    public Employee(String string, double salary) {
        //TODO Auto-generated constructor stub
    }

    public Employee(String name, double salary) {
        //TODO Auto-generated constructor stub
    }

    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("Departamento: " + department);
    }

    public void showEmployeeInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showEmployeeInfo'");
    }

    public void setSalary(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setSalary'");
    }

    public char[] getSalary() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSalary'");
    }
}