package ProductoApp;

public class DataService {

    private Product product;

    public DataService(Product product) {
        this.product = product;
    }

    public void showProductData() {
        System.out.println("Los datos del producto son: ");
        System.out.println("Nombre: " + product.getName());
        System.out.println("Precio: " + product.getPrice());
        System.out.println("Cantidad: " + product.getQuantity());
    }
}
