import java.util.*;
/**
 * Write a description of class array_column here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class array_column
{
    public static void main(){
        int r1 = 1;
        int arr[][] = new int [4][4];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
            for(int i = 0; i <arr.length; i++){
                System.out.println(" ");
                System.out.printf("Enter the elements in %d row",r1);
                System.out.println(" ");
                for(int j = 0 ; j< arr.length;j++){
                    arr[i][j] = sc.nextInt();
                }
                r1++;
            }
            r1 = 1;
            for(int i = 0; i <arr.length; i++){
                System.out.println();
                for(int j = 0 ; j< arr.length;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println(" ");
            for(int i = 0; i < arr.length; i++){
                for(int  j =0; j < arr.length; j++){
                    sum  = sum + arr[j][i];
                }
                System.out.println(" ");
                System.out.printf("sum of the elements in %d column %d",r1,sum);
                System.out.println(" ");
                sum = 0;
                r1++;
            }
    }
}
