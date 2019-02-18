public class Customer {

    String name;
    String adress;
    int phoneNo;
    int cprNo;
    String DOB;
    int accountNo;

    public Customer(){
        this.adress = adress;
        this.cprNo = cprNo;
        this.DOB = DOB;
        this.name = name;
        this.phoneNo = phoneNo;
        this.accountNo = accountNo;

    }

    public String getName() {
        name = "Mathias";
        return name;
    }

    public int getCprNo() {
        cprNo = 1405972244;
        return cprNo;
    }

    public int getPhoneNo() {
        phoneNo = 88888888;
        return phoneNo;
    }

    public String getAdress() {
        adress = "Sønderborg";
        return adress;
    }

    public String getDOB() {
        DOB = "14-05-1997";
        return DOB;
    }

    public int getAccountNo() {
        accountNo = 2255;
        return accountNo;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setCprNo(int cprNo) {
        this.cprNo = cprNo;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }
}
