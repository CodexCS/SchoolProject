import java.util.Scanner;

/**
 * Write a description of class Amicable_Number here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Amicable_Number
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        int sumA = 0;
        int sumB = 0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                sumA = sumA + i;
            }
        }
        for(int i=1;i<b;i++){
            if(b%i==0){
                sumB = sumB + i;
            }
        }
        if(sumB==a && sumA == b){
            System.out.println("These are amicable numbers");
        }
        else{
            System.out.println("These are not amicable numbers");
        }
    }
}
