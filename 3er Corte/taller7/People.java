public class People {
    private String name;
    private int age;
    private static int numPeople = 0;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
        numPeople++;
    }

    public static int getNumPeople() {
        return numPeople;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
