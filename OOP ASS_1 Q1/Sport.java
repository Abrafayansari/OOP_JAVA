package Package.com;

import java.util.ArrayList;

public class Sport {
public int sport_Id;
public String name;
public String description;
public ArrayList <Skill> required_Skills=new ArrayList<>();

public Sport (int id,String name,String description,ArrayList <Skill> required_Skills ){
this.sport_Id=id;
this.required_Skills=required_Skills;
this.description=description;
this.name=name;
}
   public void remove_Skill(Skill s){
        int ind=required_Skills.indexOf(s);
        required_Skills.remove(ind);
        System.out.println("Skill removed");


    }
   public void add_Skill(Skill s){
required_Skills.add(s);
System.out.println("Skill added successfully ");
    }
}