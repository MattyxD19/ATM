import java.util.Scanner;

public class testclass {
    public static void main(String[] args) {

        Account Mathias = new Account();
        Mathias.setBalance(8000);


        System.out.println("enter pin code");
        Scanner in = new Scanner(System.in);
        CreditCard creditCard = new CreditCard();
        int pin = in.nextInt();
        creditCard.setPinCode(2334);
        System.out.println(creditCard.validate(pin));

        if (!creditCard.validate(pin))
        {
            System.out.println("try again");
        }


        else if (creditCard.validate(pin))
        {
            System.out.println("You have: " + Mathias.getBalance());
            System.out.println("1) Withdraw \n" +
                    "2) Deposit ");
            int decision = in.nextInt();

            switch (decision)
            {
                case 1:
                    System.out.println("enter amount to withdraw");
                    double amount = in.nextDouble();
                    double balance = Mathias.getBalance();
                    Mathias.setBalance(balance - amount);
                    System.out.println("Current balance: " + Mathias.getBalance());
                    break;

                case 2:
                    System.out.println("enter amount to deposit to bank");
                    amount = in.nextDouble();
                    balance = Mathias.getBalance();
                    Mathias.setBalance(balance + amount);
                    System.out.println("Current balance; " + Mathias.getBalance());
                    break;


            }

        }




    }
}
