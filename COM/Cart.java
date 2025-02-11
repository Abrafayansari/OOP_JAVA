package PACKAGE.COM;

import java.util.Scanner;

public class Cart {
    public
    String Name;
    float price;
    int qty;
    public Cart(){
        this.Name="generic";
        this.price=0.0f;
        this.qty=1;
        System.out.println("Default product added ");
        System.out.println("Product : "+Name);
        System.out.println("Price : "+price);
        System.out.println("Quantity : "+this.qty);
    }
    public Cart(String name,float price,int qty){
        this.Name=name;
        this.price=price;
        this.qty=qty;
        System.out.println("New product added ");
        System.out.println("Product : "+this.Name);
        System.out.println("Price : "+this.price);
        System.out.println("Quantity : "+this.qty);
    }
    Scanner input=new Scanner(System.in);
    public boolean ask(){
        System.out.println("Want to delete a Student yes or no : ");
        String opt=input.nextLine();
        if(opt.equals("yes")) {
            System.out.println("Cart deleted successfully");
            return true;
        }
        System.out.println("Cart not deleted");

        return false;
    }

    protected void  finalize(){
        System.out.println("Cart deleted : "+this.Name);
    }
}
