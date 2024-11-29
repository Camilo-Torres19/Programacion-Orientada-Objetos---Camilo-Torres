package DiscountSystem;
public class Test {
    public static void main(String[] args) {
        DiscountByFixedValue discount = new DiscountByFixedValue();

        DiscountByPercentage discount2 = new DiscountByPercentage();

        DiscountApplication discountManager = new DiscountApplication();

        discountManager.apply(discount, 1000, 200);
        discountManager.apply(discount2, 1000, 50);

    }
}
