package BankOperationsSystem;

public class WitdrawBankOperation implements Witdraw {

    @Override
    public void withdraw(double amount) {
        System.out.println("Retirada de dinero por " + amount);
    }
    
}
