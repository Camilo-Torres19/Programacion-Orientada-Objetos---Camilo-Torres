public class Test {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(5, 10);
        c.calculateArea();
        r.calculateArea();


        Duck d = new Duck();
        d.fly();
        d.swim();
    }
}
