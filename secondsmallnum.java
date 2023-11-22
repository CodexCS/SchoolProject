import java.util.*;
/**
 * Write a description of class secondsmallnum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class secondsmallnum
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int m = sc.nextInt();
        System.out.println("Enter the Second number:");
        int n = sc.nextInt();
        System.out.println("Enter the third number:");
        int o = sc.nextInt();
        if(m>n)
        {
            if(m<o){
                System.out.println("The second samllest " + m);
            }
            else if (n>o){
                System.out.println("The second samllest " + n);
            }
            else{
                System.out.println("The second samllest " + o);
            }
        }
        else{
            if(n<o){
                System.out.println("The second samllest " + n);
            }
            if(m>o){
                System.out.println("The second samllest " + m);
            }
            else{
                System.out.println("The second samllest " + o);
            }
        }
    }
}