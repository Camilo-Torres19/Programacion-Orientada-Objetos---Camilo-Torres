public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public void calcArea(){
        System.out.println("El rectangulo tiene un area de " + width * height);
    }
}
