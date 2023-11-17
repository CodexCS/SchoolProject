import java.util.*;
/**
 * Write a description of class palidrone_number here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class palidrone_number
{
    public static void main(){
        System.out.println("Enter a number");
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int r = 0; 
        int d = 0;
        int num = a;
        while(a>0)
        {
             d = a%10;
             r = r*10 + d;
             a = a/10;
        }
        if(num==r){
            System.out.println("This is a palindrone number");
        }
        else{
            System.out.println("This is not palindrone number");
        }
    }
}
