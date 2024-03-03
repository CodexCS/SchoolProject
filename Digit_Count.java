import java.util.*;
/**
 * Write a description of class Digit_Count here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Digit_Count
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = 0;
        do
        {
            int l = num%10;
            num = num/10;
            n++;
        } while(num > 0);
        if(n%2==0){
            System.out.println("Number of digit"+" "+n);
            System.out.print("This is has even number of digit");
        }
        else{
            System.out.println("Number of digit"+" "+n);
            System.out.print("This is has odd number of digit");
        }
        
    }
}
