public abstract class Employee {

    protected String name;
    protected int age;
    protected double salary;

    public abstract void calculateSalary();

    public void showDetails(){
        calculateSalary();
    }
}

class Manager extends Employee {
    private double bonus;

    Manager(String name, int age, double salaray, double bonuse){
        this.name = name;
        this.age = age;
        this.salary = salaray;
        this.bonus = bonuse;
    }

    public Manager(String string, int i, String string2) {
        //TODO Auto-generated constructor stub
    }

    @Override
    public void calculateSalary() {
        System.out.println("Salario del Gerente es: " + (salary + bonus));
    }

    @Override
    public void showDetails() {
        System.out.println("Informacion del Gerente:");
        System.out.println("Nombre: " + super.name);
        System.out.println("Edad: " + super.age);
        calculateSalary();
    }

    public void showEmployeeInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showEmployeeInfo'");
    }
}

class SalesPerson extends Employee {
    private double taxes;

    SalesPerson(String name, int age, double salaray, double taxes){
        this.name = name;
        this.age = age;
        this.salary = salaray;
        this.taxes = taxes;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Salario del Vendedor es: " + (salary - taxes));
    }

    @Override
    public void showDetails() {
        System.out.println("Informacion del Vendedor:");
        System.out.println("Nombre: " + super.name);
        System.out.println("Edad: " + super.age);
        calculateSalary();
    }
}
