import java.util.*;
/**
 * Write a description of class small_digit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class small_digit extends Neon_Number_Practice
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int min = a%10;
        int r = 0;
        while(a>0){
            r = a%10;
            if(min > r ){
                min = r;
            }
            a=a/10;
            System.out.println(min);
        }
        
        
    }
}
