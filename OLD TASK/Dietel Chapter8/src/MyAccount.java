import Composition.Date;

public class MyAccount {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    public MyAccount(){

    }

    public MyAccount(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest(){
        return annualInterestRate * 12;
    }

    public double withdraw(double amount){
        return balance - amount;
    }

    public void deposit(double amount){
        balance += amount;
    }


}
