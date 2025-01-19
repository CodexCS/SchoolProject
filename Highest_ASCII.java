import java.util.*;

/**
 * Write a description of class Highest_ASCII here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Highest_ASCII
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        char arr[] = new char[10];
        for(int i =0;i<10;i++){
            arr[i] = sc.nextLine().charAt(0);
        }
        int high = (int) arr[0];
        int min = (int) arr[0];
        for(int i=0;i<10;i++){
            if(high < arr[i]){
                high = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Highest ASCII key value"+ (char)high);
        System.out.println("Lowest ASCII key value"+ (char)min);
    }
}
