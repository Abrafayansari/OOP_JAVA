package Package.com;
import java.util.ArrayList;

public class Mentor {
public int m_Id;
public String name;
public ArrayList <String> sportsExpertise=new ArrayList<>();
public int max_Learners;
public ArrayList <Student>assigned_learners=new ArrayList<>();

public Mentor(int id,String name,ArrayList <String>sportsExpertise,int max_Learners){
    this.m_Id=id;
    this.name=name;
    this.sportsExpertise=sportsExpertise;
    this.max_Learners = max_Learners;
}
public void assign_Learner(Student s){
if(this.max_Learners>=this.assigned_learners.size()){
    this.assigned_learners.add(s);
    System.out.println("Mentorship booked");
}else{
    System.out.println("your maximum learners limit reach out");
}
}
public void remove_Learners(Student s){
assigned_learners.remove(s);
System.out.println("Student removed");
}
void provide_Guidance(){

}
    
}