import java.util.ArrayList;
import java.util.Scanner;

public class Company {
    public
     String companyName;
     String industryType;
     String jobRole;
     ArrayList<String> requiredSkills;
    Student s=new Student();
Scanner input=new Scanner(System.in);
Company(String companyName,String industryType, String jobRole, ArrayList requiredSkills){
    this.companyName=companyName;
    this.requiredSkills=requiredSkills;
    this.jobRole=jobRole;
    this.industryType=industryType;

}
    void scheduleinterview(Student s){
        System.out.print("Enter name:");
        s.name=input.nextLine();
        System.out.print("Enter age:");
        s.age=input.nextInt();
        System.out.print("Enter slot:");
        s.slot=input.nextInt();
    }
    void displayCompanyDetails(){
        System.out.println("Company details  :"+companyName+" " +industryType+" "+jobRole+" "+requiredSkills);

    }
}
