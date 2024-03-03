import java.util.*;
/**
 * Write a description of class Buzz_number here.
 * @author (your name)
 * @version (a version number or a date)
 */
public class Buzz_number
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower limit");
        int n1 = sc.nextInt();
        System.out.println("Enter the upper limit");
        int n2 = sc.nextInt();
        int n = 0;
        while(n1 <= n2){
            if(n1%10 == 7|| n1%7 == 0)
            {
                 n++;
                 System.out.println(n1);
            }
            n1++;
        }
        System.out.print(n);
            
        
    }
}
