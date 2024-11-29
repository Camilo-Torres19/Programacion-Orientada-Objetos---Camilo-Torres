package ProductoApp;

public class CalcPriceService {

    private Product product;

    public CalcPriceService(Product product) {
        this.product = product;
    }

    public void calculatePrice() {
        System.out.println("El precio del producto es: " + product.getPrice() * product.getQuantity());
    }
    
}
