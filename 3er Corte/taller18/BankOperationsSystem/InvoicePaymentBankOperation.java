package BankOperationsSystem;

public class InvoicePaymentBankOperation implements InvoicePayment {

    @Override
    public void payInvoice(String invoiceNumber, double amount) {
        System.out.println("Pago de factura: " + invoiceNumber + " por " + amount);
    }

}
