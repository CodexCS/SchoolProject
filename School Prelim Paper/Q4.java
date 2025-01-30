package AVN;
import java.util.Scanner;


/**
 * Write a description of class Q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q4
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Index number");
        String number = sc.next();
        
            if(number.charAt(0)=='1'){
                System.out.println("Class: 10");
                System.out.print("Year:" + number.charAt(1)+number.charAt(2));
                System.out.print("Center number:" + number.charAt(3)+number.charAt(4)+number.charAt(5)+number.charAt(6));
                System.out.print("Index Number:" + number.charAt(9)+number.charAt(8)+number.charAt(10));
            }
            else{
                System.out.println("Class: 12");
                System.out.println("Year:" + number.charAt(1)+number.charAt(2));
                System.out.println("Center number:" + number.charAt(3)+number.charAt(4)+number.charAt(5)+number.charAt(6));
                System.out.println("Index Number:" + number.charAt(8)+number.charAt(9)+number.charAt(10));
            }
            }
        }
    

