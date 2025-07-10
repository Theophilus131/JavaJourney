package SavingAccount;



public class TestingClass {
    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        System.out.printf("Savings Balance(rate):%n\tAccount 1 balance:$%.2f%n\tAccount 2 balance:$%.2f%n%n", saver1.getSavingsBalance(), saver2.getSavingsBalance());

        SavingsAccount.modifyMonthlyInterestRate(4);
        for(int month = 1; month <= 12; month++){
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }


        System.out.printf("Savings Balance(4%% interest rate):%n\tAccount 1 balance:$%.2f%n\tAccount 2 balance:$%.2f%n%n", saver1.getSavingsBalance(), saver2.getSavingsBalance());

        SavingsAccount.modifyMonthlyInterestRate(5);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("Savings Balance(5%% interest rate):%n\tAccount 1 balance:$%.2f%n\tAccount 2 balance:$%.2f%n%n", saver1.getSavingsBalance(), saver2.getSavingsBalance());

    }
}
