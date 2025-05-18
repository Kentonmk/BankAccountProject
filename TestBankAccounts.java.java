public class TestBankAccounts {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();

        account.setFirstName("John");
        account.setLastName("Doe");
        account.setAccountID(12345);
        account.setInterestRate(1.5);

        account.displayAccount();

        account.deposit(200.0);
        account.displayAccount();

        account.processWithdrawal(250.0);
        account.displayAccount();
    }
}
