import java.util.*;
/**
 * Write a description of class series2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */ 
//a/2 + a/3 + a/4 ...............n
public class series2
{
    public static void main(){
        System.out.println("Enter the limit");
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls enter the constant");
        int a = sc.nextInt();
        System.out.println("Pls enter the limit");
        int n = sc.nextInt();
        int l = 2;
        double result = 0;
        for(;l<=n;l++){
             result = result + (double)a/l;
        }
        System.out.println(result);
        
    }
}
