import java.util.*;
/**
 * Write a description of class factorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class factorial
{
   public static void main(){
        System.out.println("Enter a number whose factoial you want to find");
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        int fac = 1;
        for(i=1;i<=num;i++){
            fac = fac * i ;
        }// fac means factorial 
        System.out.println(fac);
   }
}
