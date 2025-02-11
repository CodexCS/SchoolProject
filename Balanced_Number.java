import java.util.*;

/**
 * Write a description of class Balanced_Number here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Balanced_Number
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int d = 0;
        int sume = 0;
        int sumo = 0;
        for(int i=0;num>0;i++){
             d = num%10;
             num = num/10;
             if(d%2==0){
                 sume = sume + d;
             }
             else{
                 sumo = sumo + d;
             }
        }
        if(sumo==sume){
            System.out.println("This is a balanced number");
        }
        else{
            System.out.println("This is not a balanced number");
        }
    }
}
