public class Circle extends Figure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public void calculateArea() {
        System.out.println("Area de un circulo: " + Math.PI * radius * radius);
    }
}
