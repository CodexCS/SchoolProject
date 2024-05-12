import java.util.*;
/**
 * Write a description of class deleting_in_array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class deleting_in_array
{
    public static void main(){
        int arr[] = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elemet do you want in your array");
        int n = sc.nextInt();
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("THE ORIGNAL ARRAY");
        for(int i = 0; i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("Which index you want to delete");
        int pos  =sc.nextInt();
        System.out.println("The number" + arr[pos]+ "is deleted");
        for(int i = pos  ; i<n; i++ ){
            arr[i] = arr[i+1];
        }

        --n;
        System.out.println("THE EDITED ARRAY");
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]+" ");
        }
    }

}

