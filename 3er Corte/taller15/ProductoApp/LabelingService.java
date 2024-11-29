package ProductoApp;

public class LabelingService {

    private Product product;


    public LabelingService(Product product) {
        this.product = product;
    }

    public void labelProduct() {
        System.out.println("Etiquetando producto"+ product.getName());
    }
}
