import Package.com.Mentor;
import Package.com.Skill;
import Package.com.Sport;
import Package.com.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class  Main{
    public static void main(String[] args) {

        Skill sk1=new Skill(1,"fittness","this is very good skill");
        Skill sk2=new Skill(2,"defence","this is very good skill");
        Skill sk3=new Skill(3,"attack","this is very good skill");
        Skill sk4=new Skill(4,"clever shots","this is very good skill");





        ArrayList <Skill>requiredskills=new ArrayList<>(Arrays.asList(sk1,sk2,sk3,sk4));
        Sport sp1=new Sport(1,"cricket","cricket is very interesting sport" ,requiredskills);
        Sport sp2=new Sport(2,"volleyball","volleyball is very interesting sport" ,requiredskills);
        Sport sp3=new Sport(3,"basketball","basketball is very interesting sport" ,requiredskills);



        ArrayList <Sport>sportsinterest=new ArrayList<>(Arrays.asList(sp1,sp2,sp3));
        Student s1=new Student(1,"Rafay",19,sportsinterest);
        Student s2=new Student(2,"moix",19,sportsinterest);
        Student s3=new Student(3,"umar",19,sportsinterest);
        Student s4=new Student(4,"umar",19,sportsinterest);


        ArrayList <String>sportExpertise=new ArrayList<>(Arrays.asList("Cricket","football","volleyball"));
        // ArrayList <Student>assignedlearners=new ArrayList<>(Arrays.asList(s1,s2,s3));
        Mentor m1=new Mentor(1,"haris",sportExpertise,3);


        s4.registerForMentorship(m1);
        s4.viewMentorDetails(m1);
        s4.updateSportsInterest(sp1);
        s4.updateSportsInterest(sp2);
        System.out.println(s4.sportsInterest.get(0).name);
        System.out.println(s4.sportsInterest.get(0).description);

        m1.assign_Learner(s3);
        s2.registerForMentorship(m1);
        s1.registerForMentorship(m1);
        s3.registerForMentorship(m1);
        s4.registerForMentorship(m1);

        m1.remove_Learners(s4);
 

        sp1.add_Skill(sk1);
        sp2.add_Skill(sk2);
        sp1.remove_Skill(sk1);
        sp2.remove_Skill(sk2);


        sk1.showSkillDetail();
        sk1.skill_description_update("this is new description");
        sk1.showSkillDetail();

    }
}