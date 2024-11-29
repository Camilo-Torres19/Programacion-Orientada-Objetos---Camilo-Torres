package DiscountSystem;
public class DiscountByFixedValue extends Discount {

    @Override
    public void apply(double amount, double discountValue) {
        System.out.printf("El valor final con descuento de %.0f es de %.2f\n", discountValue, amount - discountValue);
    }

}