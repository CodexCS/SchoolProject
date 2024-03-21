import java.util.*;

/**
 * Write a description of class LegalBookChecker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LegalBookChecker
{
    public static void main(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a 10 digit number");
        int  a = sc.nextInt ();
        int  d = 0;
        int  sum = 0;
        int  product = 0;
        for(int i = 1; i<=10; i++){
            d = a%10;
            a = a/10;
            product = d*i;
            sum = sum + product;
        }
        System.out.println(sum);
        if(sum%11.0==0.0){
            System.out.println("This is a legal book");
        }
        else{
            System.out.println("Illegal bΘΘk");
        }
    }
}
