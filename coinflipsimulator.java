import java.math.*;
/**
 * Write a description of class coinflipsimulator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class coinflipsimulator
{
    public static void main()
    {
        int i = 1;
        int h1 = 0;
        int t1 = 0;
        for(i=1;i<=20;i++)
            {
            double x = Math.random() * 20;
            int f = (int)x;
            if(f>=10){
                 t1 = t1+ 1;
            }
            else{
                h1 = h1+1;
            }
        }
        System.out.println("Number of times Heads has come" + h1);
        System.out.println("Number of times Tails has come" + t1);
    }
    
    
}
