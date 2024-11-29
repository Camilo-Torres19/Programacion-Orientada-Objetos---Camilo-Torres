public class Test {
    public static void main(String[] args) {
        People p = new People();
        p.introduce();

        People p1 = new Student();
        p1.introduce();

        People p2 = new Teacher();
        p2.introduce();


        Vehicle v = new Car();
        v.move();

        Vehicle v1 = new Bike();
        v1.move();


        Figure f = new Rectangle(10, 20);
        f.calcArea();

        Figure f1 = new Circle(5);
        f1.calcArea();
    }
}
