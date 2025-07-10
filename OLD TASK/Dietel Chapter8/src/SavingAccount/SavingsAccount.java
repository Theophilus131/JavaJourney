package SavingAccount;

public class SavingsAccount {

      private double savingsBalance;

      private static double annualInterestRate;

        public SavingsAccount( double savingsBalance ) {
            this.savingsBalance = savingsBalance;

        }

      public void calculateMonthlyInterest() {

        savingsBalance += (savingsBalance * (annualInterestRate / 100)) / 12;

      }

      public double getSavingsBalance() {
            return savingsBalance;
      }


      public static void modifyMonthlyInterestRate(double newRate) {
          annualInterestRate = newRate;

      }












}







