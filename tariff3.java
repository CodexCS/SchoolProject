import java.util.*;
/**
 * Write a description of class tariff3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tariff3 extends assighnment1
{
    public static void main ()
{
        
        Scanner sc =  new Scanner(System.in);
        int distance = sc.nextInt();
        int cost =0;
        if(distance <= 10)
        {
             cost = 80;
        }
        else if((10 < distance) && (distance <= 20))
        {
             cost = 80 + (distance - 10) * 6;
        }
        else if((20 < distance) && (distance <= 30))
        {
             cost = 80 + 60 + (distance - 20)* 5;
        }
        else if(30 < distance)
        {
              cost = 80 + 60 + 50 + (distance - 30)*4;
        }     
            
        System.out.println(cost);
        
    
    
    
}
}
