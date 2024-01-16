import java.util.*;


/**
 * Write a description of class number here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number
{
    public static void main(){
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int n = 0;
        int s = 0;
        int i = 0;
        int g = a;
        for(  ;a>0;){
             i = i + 1;
            n = a%10;
            a = a/10;
        }
        for(;g>0;){
            n = g%10;
            //System.out.println(n);
            s =   (int) Math.pow(n,i) + s;
            g = g/10;
        }
        System.out.println("The sum of number is " + s);
        
        
        
    
    }
}
