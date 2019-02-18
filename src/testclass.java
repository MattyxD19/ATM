import java.util.Scanner;

public class testclass {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int pin = in.nextInt();
        System.out.println("enter pin code");

        CreditCard creditCard = new CreditCard();

        creditCard.validate(2334);


    }
}
