package Package.com;
import java.util.ArrayList;
import java.util.Scanner;
public class Student{
    private int s_Id;
    public String name;
    public int age;
    public ArrayList <Sport>sportsInterest=new ArrayList<>();
    public String mentorAssigned;

public Student(int id,String name,int age,ArrayList <Sport>sportsInterest){
this.s_Id=id;
this.name=name;
this.age=age;
this.sportsInterest=sportsInterest;
}
    public void registerForMentorship(Mentor m){
if(m.assigned_learners.size() <= m.max_Learners){
    m.assign_Learner(this);
this.mentorAssigned=m.name;
System.out.println("Mentorship confirmed");
}else{
    System.out.println("There is no free space");
}
}
   public void viewMentorDetails(Mentor m){
        System.out.println("Mentor details ---->");
        System.out.println("Mentor name : "+m.name);
        System.out.println("Mentor's Sport expertise : "+m.sportsExpertise);
}
Scanner input=new Scanner(System.in);
    public void updateSportsInterest(Sport s) {
        sportsInterest.add(s);
    }


}