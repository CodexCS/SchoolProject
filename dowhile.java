import java.util.*;
/**
 * Write a description of class dowhile here.
 *
 * @author (your name)
 * @version (a vesion number or a date)
 */
public class dowhile
{
    public static void main() 
    {
        Scanner sc  = new Scanner(System.in);
        int i = sc.nextInt();
        int n = 0;
        do
        {
        n = i%10;
        i = i/10;
        System.out.println(n +" ");
        
    
        }
        while(i>0);
    }
}
