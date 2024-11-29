
public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("Daniel", 4000);
        employee.showEmployeeInfo();

        Manager manager = new Manager("Carolina", 10000, "IT"); 
        manager.showEmployeeInfo();
    }
}