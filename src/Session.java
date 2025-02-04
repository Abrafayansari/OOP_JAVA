import java.util.Scanner;

public class Session {
    public
   String sessionTitle;
   String speakerName;
   float duration;
   int roomNumber;
Scanner input=new Scanner(System.in);
   void scheduleSession(){
       System.out.print("Enter name of speaker :");
       String name=input.nextLine();
       System.out.print("Enter room of session :");
       int room=input.nextInt();
       input.nextLine();
       System.out.print("Enter sessionTitle of speaker :");
       String sessionTitle=input.nextLine();
       System.out.print("Enter duration of session :");
       float duration=input.nextFloat();
this.roomNumber=room;
this.speakerName=name;
this.sessionTitle=sessionTitle;
this.duration=duration;

   }
    void displaySessionDetails(){
        System.out.println("session details :"+speakerName+" " +sessionTitle+" "+duration+" "+roomNumber);

    }

}
