public class People {
    protected String name;
    protected int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("El nombre es " + name + " y tiene " + age + " años");
    }
}

class Student extends People {
    private String registration;

    public Student(String name, int age, double registration) {
        super(name, age);
        this.registration = registration;
    }

    public Student(String name, int age, double registration2) {
        //TODO Auto-generated constructor stub
    }

    public Student() {
        //TODO Auto-generated constructor stub
    }

    public Student(String name, int age, String course) {
        //TODO Auto-generated constructor stub
    }

    public Student(String string, int i) {
        //TODO Auto-generated constructor stub
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("La matricula del estudiante es " + registration);
    }

    public char[] getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

    public char[] getAverageGrade() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAverageGrade'");
    }

    public void setName(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setName'");
    }

    public char[] getAge() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAge'");
    }

    public void setAge(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAge'");
    }

    public void setAverageGrade(double d) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAverageGrade'");
    }
}
