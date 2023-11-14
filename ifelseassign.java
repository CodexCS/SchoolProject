import java.util.*;
public class ifelseassign{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you Name: ");
        String name = sc.nextLine();
        System.out.println("Enter your marks in physics: ");
        int phym = sc.nextInt();
        System.out.println("Enter your marks in maths: ");
        int mathm = sc.nextInt();
        System.out.println("Enter your marks in chemistry: ");
        int chemm = sc.nextInt();
        double avg = (phym + mathm + chemm)/3;
        String gr="";
        if(avg>=80){
            gr = "Distiction";
        }
        else if(avg>=60 && avg < 80){
            gr  = "First Divison";
        }
        else if(avg>=45 && avg < 60){
            gr = "Second Division";
        }
         else if(avg>=40 && avg < 45){
            gr = "Third Dvision";
        }
         else if(avg<=40){
            gr = "Failure";
        }
        System.out.println("Your name is :"+ name);
        System.out.println("Your Avg is :" + avg);
        System.out.println("You have received: "+ gr);
    }
}