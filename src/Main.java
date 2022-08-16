public class Main {
    public static void main(String[] args) {

        bankAccount MervansAccount = new bankAccount(1233, "Mervan Polat",
                "28101998", "mervanpolat@icloud.com", "06767113598");
        System.out.println(MervansAccount.balance);
        System.out.println(MervansAccount.customerName);
        System.out.println(MervansAccount.eMail);


        MervansAccount.depositFunds(3233);
        MervansAccount.withdrawFunds(343);
        System.out.println(MervansAccount.accountNumber);
        System.out.println(MervansAccount.customerName);
    }
}


