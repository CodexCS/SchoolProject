import java.util.*;
/**
 * Write a description of class duck_number here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class duck_number
{
    public static void main(){
        Scanner sc = new Scanner(System.in);        
        int n = sc.nextInt();
        int a = 0;
        for(; n>0;){
            a = n%10;
            if(a==0){
                System.out.println("This is a duck number");
            }
            n = n/10;
        }
        System.out.println("This is not a  duck number");
    }
}
