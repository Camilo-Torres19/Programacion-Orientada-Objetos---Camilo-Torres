public class Student {
    private String name;
    private int age;
    private String course;

    public Student(){
        name = "Student's name";
        age = 0;
        course = "Student's course";
    }

    public Student(String name, int age ){
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String course){
        this(name, age);
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [name =" + name + ", age =" + age + ", course =" + course + "]";
    }

    
}
