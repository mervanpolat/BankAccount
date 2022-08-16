public class bankAccount {

    int balance;
    String customerName, eMail, phoneNumber, accountNumber;

    //Using Constructors for the first time!
    //Instead of passing values to setters, we can use constructors for this purpose!
    public bankAccount() {
        //Constructor Overloading -> The logic behind this method is, we want to create a constructor with default values.
        //Constructor Overloading or any other overloading can only be done by changing the parameters.
        //This could be done by using the "this" keyword!
        // We now declared a constructor within a constructor. This is optional though.
        this(46544, "Default Name", "Default Name",
                "Default Address", "Default Phone");
        System.out.println("Empty constructor is called!");
    }

    public bankAccount(int balance, String customerName, String accountNumber, String eMail, String phoneNumber) {
        this.balance = balance;
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        System.out.println("Account constructor with parameters called.");
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {

        this.balance = balance;

    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBalance() {
        System.out.println("Your current balance is: €" + balance);
        return 0;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String geteMail() {
        return eMail;
    }


    public int depositFunds(int funds) {
        this.balance = balance + funds;
        System.out.println("Fund of €" + funds + " is processed." + " Current balance is: €" + balance);
        return balance;
    }

    public int withdrawFunds(int withdraw) {
        if (withdraw > this.balance) {
            System.out.println("Kontolimit erreicht!");
            return -1;
        } else {
            this.balance = balance - withdraw;
            System.out.println("Withdrawal of €" + withdraw + " is processed." + " Current balance is: €" + balance);
            return balance;
        }
    }

}
