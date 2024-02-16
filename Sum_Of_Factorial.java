import java.util.*;
/**
 * Write a description of class Sum_Of_Factorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sum_Of_Factorial
{
    public static void main() {
        int r = 1;
        int s = 0;
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        for(;n >= 1; n--){
            for(int j = 1; j<=n; j++){
             r = r *j; 
             
            }
            s = s + r;
            r = 1;
        }
        
        System.out.print(s);
    }
}
