import java.util.Scanner;

/**
 * Write a description of class Devil_Number here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Devil_Number
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int digit = 0;
        int c = 0;
        while(a>0){
             digit = a%10;
             if(digit==1){
                 c++;
             }
            a = a/10;
        }
        if(c%2==0){
            System.out.println("This is a devil number");
        }
        else{
            System.out.println("This is not a devil number");
        }
    }
}
