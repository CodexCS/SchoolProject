import java.util.*;

/**
 * Write a description of class AUS4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AUS4
{
    public static void main(){
        int c = 0;
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0; i <5; i++){
            arr[i] = sc.nextInt();
        }
        for(int j = 0; j<5;j++){
            for(int i =1; i <= arr[j]; i++){
                if(arr[j]%i==0){
                    c++;
                }
            }
            if(c==2){
                System.out.println(arr[j]);
            }
            else if (c>2){
                System.out.println("Neither prime nor composite");
            }
            c = 0;
        }
    }
}
