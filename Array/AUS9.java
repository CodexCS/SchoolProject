import java.util.Scanner;
import java.lang.Math;
/**
 * Write a description of class AUS9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AUS9
{
    public static void main(){
        Scanner sc  =new Scanner(System.in);
        double arr[] = new double[5];
        for(int i = 0; i<5;i++){
            arr[i] = sc.nextDouble();
        }
        for(int i = 0; i <5;i++){
            double root  = Math.sqrt(arr[i]);
            if(root*root == arr[i]){
                int num = (int)arr[i];
                System.out.println(num);
            }
        }
    }
}
