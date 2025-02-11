package PACKAGE.COM;
public class Account {
    public
    String customer_Name;
    int account_no;
    float balance;
     public Account(){
        this.account_no=0000;
        this.balance=0.0f;
        this.customer_Name="default";
        System.out.println("Default account created");
        System.out.println("Account number : "+account_no);
        System.out.println("Customer name : "+customer_Name);
        System.out.println("Balance : "+balance);

    }
    public Account(String customer_Name,int account_no,float balance){
this.customer_Name=customer_Name;
this.account_no=account_no;
this.balance=balance;
        System.out.println("Parameterized account created");
        System.out.println("Coustomer name : "+customer_Name);
        System.out.println("Account no : "+account_no);
        System.out.println("Balance : "+balance);
    }
    protected void finalize(){
         System.out.println("Account deleted successfully");
    }

}
