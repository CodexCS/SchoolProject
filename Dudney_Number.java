import java.util.Scanner;

/**
 * Write a description of class Dudney_NUmber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dudney_Number
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int cbrt = 0;
        int sd = 0;
        int d = 0;
        if(num > 0){
            cbrt = (int) Math.cbrt(num);
            while(num>0){
                d = num%10;
                sd = sd + d;
                num = num/10;
            }
        }
        else{
            sd = 1;
        }
        if(cbrt == sd){
            System.out.println("This is a Dudney Number");
        }
        else{
            System.out.println("This is not a Dudney Number");
        }
    }
}
