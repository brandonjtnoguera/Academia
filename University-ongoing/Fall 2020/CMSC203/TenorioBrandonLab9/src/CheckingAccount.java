public class CheckingAccount extends BankAccount{

    final static double FEE = 0.15;

    public CheckingAccount(String name, double initialAmount){
        super.setAccountNumber(super.getAccountNumber() + "-10");

    }

    @Override
    public boolean withdraw(double amount){
        double amountPlusTax = amount + FEE;
        boolean withdraw;
        withdraw = super.withdraw(amountPlusTax);
        return withdraw;
    }
}
