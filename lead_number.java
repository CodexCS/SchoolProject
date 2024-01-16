import java.util.*;
/**
 * Write a description of class lead_number here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class lead_number extends CompositeandSmall
{
    public static void main(){
        Scanner sc  = new Scanner(System.in);
        int a  =sc.nextInt();
        int n = 0;
        int pe = 0;
        int po = 0;
        for(;a>0;){
             n= a%10;
             if(n%2==0){
                 pe = pe + n;
             }
             else{
                 po = po + n;
             }
             a = a/10;
        }
        if(pe==po){
            System.out.println("This is a lead number");
        }
        else{
            System.out.println("This not leda number");
        }
    }
}
