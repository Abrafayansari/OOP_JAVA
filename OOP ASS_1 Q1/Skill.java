package Package.com;

public class Skill {

    public int skill_Id;
    public String name;
    public String description;
  public  void showSkillDetail(){
        System.out.println("Skill details ->>>>");
        System.out.println("Skill name : "+this.name);
        System.out.println("Skill description : "+this.description);

    }

    public Skill(int id,String name,String description){
        this.description=description;
        this.skill_Id=id;
        this.name=name;
    }
   public void skill_description_update(String new_desc){
this.description=new_desc;
    }
}
