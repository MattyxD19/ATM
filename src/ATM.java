import java.util.ArrayList;
import java.util.Scanner;

public class ATM {

    private ArrayList<Money> moneyBills = new ArrayList<>();
    private int atmID;

    public ATM(ArrayList<Money> moneyBills, int atmID){
        this.moneyBills = moneyBills;
        this.atmID = atmID;
    }

    public void display(){
        Customer firstCustomer = new Customer();

        Scanner in = new Scanner(System.in);
        int pin = in.nextInt();
        System.out.println("Enter pin-code");

    }

    public double withdraw (double amount){

        return 0;
    }

    public double getBalance(){

        return 0;
    }

    public void handoutMoneyBills(){

    }

    public void refillMoneyBills(){

    }

    public void startTransactio(){

    }


}
