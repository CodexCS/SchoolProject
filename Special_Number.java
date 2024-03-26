import java.util.*;
/**
 * Write a description of class Special_Number here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Special_Number
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int factorial = 1;
        int sumoff = 0;
        int n = 0;;
        a = n;
        for(;a>0;){
            int m = a%10;
            a = a/10;
            for(int i =1;i<=m; i++){
                 factorial = factorial * i;
            }
            sumoff = sumoff + factorial;
            factorial = 1;
        }
        if(sumoff == n){
            System.out.println("This is Speacial Number");
        }
        else{
            System.out.println("This is not Speacial Number");
        }
    }
}
