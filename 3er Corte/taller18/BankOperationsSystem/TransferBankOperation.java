package BankOperationsSystem;

public class TransferBankOperation implements Transfer {

    @Override
    public void transfer(String destination, double amount) {
        System.out.println("Transferencia de dinero a: " + destination + " por " + amount);
    }
    
}
