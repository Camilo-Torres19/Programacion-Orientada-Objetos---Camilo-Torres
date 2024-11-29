package DiscountSystem;
public class DiscountByPercentage extends Discount {
    private double percentage;
    
    @Override
    public void apply(double amount, double discountValuePercentage) {
        percentage = discountValuePercentage / 100;
        System.out.printf("El valor final con descuento de %.0f porciento es de %.2f\n", discountValuePercentage, amount * (1 - percentage));
    }
    
}
