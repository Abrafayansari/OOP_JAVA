public class Stadium {
public
    String name;
    String city;
    float capacity;
    int matches=0;
    Stadium(String name,String city,float capacity){
        this.name=name;
        this.city=city;
        this.capacity=capacity;
    }
    void schedule_match(){
        this.matches++;
    }
    void display(){
        System.out.println("Stadium details :"+name+" " +city+" "+capacity+" "+matches);
    }
}
