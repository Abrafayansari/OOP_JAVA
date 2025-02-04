import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Stadium s=new Stadium("karachi stadium","karachi",2000090);
//s.schedule_match();
//s.display();
//Stadium s2=new Stadium("lahore stadium","lahore",2000030);
//        s2.schedule_match();
//        s2.display();

//Session cyber=new Session();
//Session Ai=new Session();
//        System.out.print("Enter field from (Ai or cyber):");
//        String type=input.nextLine();
//        if(type.equalsIgnoreCase("Ai")){
//
//            Ai.scheduleSession();
//            Ai.displaySessionDetails();
//        }else{
//            cyber.scheduleSession();
//            cyber.displaySessionDetails();
//        }

//Student s=new Student();
        ArrayList <String> req1= new ArrayList<>();
        req1.add("java");
        req1.add("python");
        req1.add("Sql");
        ArrayList <String> req2= new ArrayList<>();
        req2.add("java");
        req2.add("java script");
        req2.add("mongo db");

Company c1=new Company("Systems Limited","tech","Software Engineers",req1);
c1.scheduleinterview(c1.s);
c1.displayCompanyDetails();
Company c2=new Company("Devsinc","tech","Software Engineers",req2);
c2.scheduleinterview(c2.s);
c2.displayCompanyDetails();
    }
}