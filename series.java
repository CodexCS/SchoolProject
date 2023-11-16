import java.util.*;
/**
 * Write a description of class series here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class series extends VakuesandDatatype
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a  = 1;
        double result = 0;
        double result2 = 0;
        int i = 0;
        for(a=1;a<=n;a++){
            if(a%2==0)
            {
                result = result - (double)a/(a+1);
                
            }
            else
            { 
                 result = result + (double)a/(a+1);
                 
            }
        }
        System.out.println(result);
    }
}
