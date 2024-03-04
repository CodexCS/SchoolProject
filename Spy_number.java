import java.util.*;
/**
 * Write a description of class Spy_number here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Spy_number
{
    public static void main(){
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter a number");
        int a  = sc.nextInt();
        int n = 0;
        int pro = 1;
        int sum = 0;
        for(;a>0;)
        {
            n= a%10;
            pro = pro * n;
            sum = sum + n;
            a = a/10;
        }
        if(pro == sum)
        {
            System.out.println("This is a spy number");
        }
        else {
            System.out.println("This is not a spy number");
        }
    }
}
