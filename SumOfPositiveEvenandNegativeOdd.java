import java.util.*;

/**
 * Write a description of class SumOfPositiveEvenandNegaticeOdd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumOfPositiveEvenandNegativeOdd
{
    public static void main(){
        System.out.println("How many number do you want to give");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int i = 1;
        int input = 0;
        int ps = 0;
        int pn = 0;
        for(i=1;i<=l;i++){
            input = sc.nextInt();
            if(input>0&&input%2==0){
                 ps = ps + input;
            }
            else if(input<0&&input%2!=0){
                pn = pn + input;
            }
            else if(input == 0 ){
                System.exit(0);
            }
        }
        System.out.println("Sum of Positive even number"+" " + ps);
        System.out.println("Sum of Negative odd number"+" " + pn);
    }
}
