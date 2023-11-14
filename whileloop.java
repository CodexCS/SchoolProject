import java.util.*;
/**
 * Write a description of class whileloop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class whileloop
    {   
    public static void main()
    {
        Scanner sc  = new Scanner(System.in);
        int i  = sc.nextInt();
        int n = 0;
        int q = 0;
        while(i>0){
            n = i%10;
            i = i/10;
            System.out.println(n+" ");
            
        }
        
        
        
        
        
        

    }
    }