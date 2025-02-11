package PACKAGE.COM;

import java.util.Scanner;

public class Student {
    public
     String name;
     int id;
    float gpa;
    Scanner input=new Scanner(System.in);

    public Student(){
        System.out.println("Default student created ");
        this.name="default";
        this.gpa=0.0f;
        this.id=000;
        System.out.println("Name : "+name);
        System.out.println("Gpa : "+gpa);
        System.out.println("Id : "+id);


    }
    public boolean ask(){
        System.out.println("Want to delete a Student yes or no : ");
        String opt=input.nextLine();
        if(opt.equals("yes")) {
            System.out.println("Student deleted successfully");
       return true;
        }
        System.out.println("Student not deleted");

        return false;
    }
    public Student(String name,int id,float gpa ){
        System.out.println("New student profile created ");
        this.name=name;
        this.id=id;
        this.gpa=gpa;
        System.out.println("Name : "+name);
        System.out.println("Gpa : "+gpa);
        System.out.println("Id : "+id);

    }
    protected void  finalize(){
        System.out.println("Student record deleted : "+this.name+this.id+this.gpa);
    }

}
