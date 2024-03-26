import java.util.*;
/**
 * Write a description of class twisted_prime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class twisted_prime
{
        public static void main () {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int rv = 0;
        int counter1 =0;
        int counter2 = 0;
        for(int i = 1; i<=n; i++){
            if(n%i==0){
                counter1++;
            }
        }
        for(;n>0;){
            a = n%10;
            rv = 10*rv + a;
            n = n/10;
        }
        for(int i = 1; i<=rv; i++){
            if(rv%i==0){
                counter2++;
            }
        }
        if(counter1==2&&counter2==2){
            System.out.println("This is twisted number");
        }
        else{
            System.out.println("Thi is not a twisted number");
        }
    }
}

