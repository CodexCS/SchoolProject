import java.util.*;
/**
 * Write a description of class triangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class triangle
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides of triangle");
        System.out.println("Enter the first side");
        int n = sc.nextInt();
        System.out.println("Enter the first side");
        int m = sc.nextInt();
        System.out.println("Enter the first side");
        int p = sc.nextInt();
        if( n + m > p && p + m > n && p + n > m){
            if(n==m && m==p){
                System.out.println("This is an equilateral Triangle");
            }
            else if((n==m)||(m==p)||(p==n)){
                System.out.println("This is an isoceles Triangle");
            }
            else if (n!=m && m!=p && n!=p){
                System.out.println("This a scalene Triangle");
            }
        }
        else{
            System.out.println("This triangle is not possible");
        }
    }
}
