public class Circle extends Figure {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public void calcArea(){
        System.out.println("El area del circulo es " + Math.PI * radius * radius);
    }
}
