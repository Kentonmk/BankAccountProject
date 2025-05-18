public class CheckingAccount extends BankAccount {
    private double interestRate;
    private static final double OVERDRAFT_FEE = 30.0;

    public CheckingAccount() {
        super();
    }

    public void processWithdrawal(double amount) {
        if (amount > 0) {
            super.withdrawal(amount);
            if (getBalance() < 0) {
                super.withdrawal(OVERDRAFT_FEE);
                System.out.println("Overdraft! A $30 fee has been charged.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void displayAccount() {
        super.accountSummary();
        System.out.printf("Interest Rate: %.2f%%\n", interestRate);
    }
}
