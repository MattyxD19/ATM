public class CreditCard {

    private int pinCode;
    private int cardNumber;
    public Customer MathiasBC = new Customer();


    public Boolean validate(int pinCode){

        if (pinCode == MathiasBC.getAccountNo())
        {
            return true;
        }
        else{
            return false;
        }

    }

    public int getPinCode(int pinCode){
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
}
