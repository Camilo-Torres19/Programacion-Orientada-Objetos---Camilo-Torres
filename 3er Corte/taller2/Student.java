public class Student {
    private String name;
    private int age;
    private Double averageGrade;

    public Student(){}
    
    public Student(String name, int age, Double averageGrade) {
        this.name = name;

        // Verificar que la edad y la nota Promedio no sean negativas
        if (age < 0 ) {
            this.age = 0;
        } else {
            this.age = age;
        }
        if (averageGrade < 0) {
            this.averageGrade = 0D;
        } else {
            this.averageGrade = averageGrade;
        }    
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public Double getAverageGrade(){
        return averageGrade;
    }
    

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        // Verificar que la edad no sea negativa
        if (age<=0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public void setAverageGrade(Double averageGrade){
        // Verificar que la nota Promedio no sea negativa
        if (averageGrade>=0) {
            this.averageGrade = averageGrade;
        } else {
            this.averageGrade = 0D;
        }
    }
    
}
