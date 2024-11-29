public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String string, int i, int j) {
        //TODO Auto-generated constructor stub
    }

    public void showProduct(){
        System.out.println("Product name: " + this.name);
        System.out.println("Product price: " + this.price);
    }

    public char[] showProductInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showProductInfo'");
    }
}