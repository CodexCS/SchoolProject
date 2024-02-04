eeimport java.util.*;
/**
 * Write a description of class primenum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class primenum
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n  = sc.nextInt();
        int i = 0; 
        int m = 0;
        int sum = 0;
        for(i=1;i<=n;i++)
            {
            if(n%i==0)
            {
              //System.out.println(i + " ");  
              sum = sum + i;
            }
        
        }
        if(sum==(n+1)){
            System.out.println("This is prime number");
        }
        else
        {
            System.out.println("This is compisite number");
        }
        
    } 
}
