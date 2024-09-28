import java.util.*;

public class RailwayTicket
{
    Scanner sc = new Scanner(System.in);
    String name,coach;
    long mobno;
    int amt,totalamt;
    void accept(){
        System.out.println("Enter your name");
        name = sc.next();
        System.out.println("Enter your coach type");
        coach = sc.next();
        System.out.println("Enter your basic amount");
        amt = sc.nextInt();
        System.out.println("Enter your mobile number");
        mobno = sc.nextLong();
    }
    void update(){
        if(coach.equalsIgnoreCase("First_AC")){
            totalamt = amt+ 700;
        }
        else if(coach.equalsIgnoreCase("Second_AC")){
            totalamt = amt+ 500;
        }
        else if(coach.equalsIgnoreCase("Third_AC")){
            totalamt = amt+ 250;
        }
        else if(coach.equalsIgnoreCase("Sleeper")){
            totalamt = amt+ 0;
        }
    }
    void display(){
        System.out.println("Your name "+name);
        System.out.println("Your coach type "+coach);
        System.out.println("Your mobile number "+mobno);
        System.out.println("Your Total amt "+totalamt);
    }
    public void main(){
        RailwayTicket ob = new RailwayTicket();
        accept();
        update();
        display();
    }
}
