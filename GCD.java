import java.util.*;
/**
 * Write a description of class GCD here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GCD
{
   public static void main(){
       Scanner sc  = new Scanner(System.in);
       System.out.println("Enter first number ");
       int a = sc.nextInt();
       System.out.println("Enter second number");
       int b = sc.nextInt();
       int gcd = 0;
       int i = 1;
       int l = 0;
       if(a>b){
            l = b;
       }
       else{
            l = a;
       }
       for(i=1;i<=l;i++){
           if(a%i==0&&b%i==0){
                gcd = i;
           }
       }
       System.out.println("The GCD of the two given"+ gcd); 
    }
}
