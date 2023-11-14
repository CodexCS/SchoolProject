import java.util.*;
/**
 * Write a description of class timepass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class timepass
{
    public static void main()
    {
        
        
        
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int number = sc.nextInt();
        int sum = 0;
        for(i=1;i<number;i++)
            {
            if(number%i==0)
            {
              System.out.println(i + " ");  
              sum = sum + i;
            }
        
        
        
        
        }
        System.out.println(sum);
        if(sum==number)
                {
                System.out.println("This perfect number");
                }
        else
                {
                    System.out.println("This imperfect number ");
                }
    }
}
