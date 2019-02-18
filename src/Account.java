import java.util.ArrayList;

public class Account {

    private int accountNumber;
    private double balance;
    private ArrayList<CreditCard> creditCards = new ArrayList<>();



    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }



    public double withdraw(double amount){

        return 0;
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;

    }
}
