import java.util.*;
/**
 * Finding Out Harshad Number using do while Harshad number mean niven numebr 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class nievendowhile
{
   public static void main()
   {
        Scanner sc = new Scanner(System.in);
        int i  = sc.nextInt();
        int n = 0;
        int s = 0;
        int i2 =  i;
        do
        {
            n = i%10;
            i = i/10;
            s = s + n;
        } 
   
        
        while(i>0);
        
        if(i2%s==0){
            System.out.println("This Harshad Number");
        }
        else 
        {
            System.out.println("This is not Harshad Number");
        }
   }
   
       
}
