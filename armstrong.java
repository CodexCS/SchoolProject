 import java.util.*;
/**
 * Write a description of class armstrong here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class armstrong
{
   public static void main(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number");
        int a =  sc.nextInt();
        int s = 0;
        int j = 1;
        int i = 0;
        int n;
        n = a;
        for(j=1;j<=3;j++){
             i = n%10;
             
             i = i*i*i;
            s = s + i;
            n = n/10;
            
            System.out.println(s);
        }
        if(s==a){
            System.out.println("This is an armstrong number");
        }
        else{
            System.out.println("This is not an armstrong number");
        }
    }
}
