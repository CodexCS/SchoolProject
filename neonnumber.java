import java.util.*;
/**
 * Write a description of class neonnumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class neonnumber
{
    public static void main()
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number:)" );
        int x = sc.nextInt();
        int i = 1;
        int sq = x*x;
        int s = 0;
        for(i=1; sq > 0;i++)
        {
            int r = sq%10;
            s = s + r;
             sq = sq/10;    
        }
        if(s==x)
        {
            System.out.println("This is a neon number");
        }
        else
        {
            System.out.println("This is not a neon number");
        }
    }
}
