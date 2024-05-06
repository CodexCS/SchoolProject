import java.util.*;
/**
 * Write a description of class diagonal_elements here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class diagonal_elements
{
    public static void main()  {
            int arr[][] = new int [4][4];
            int sum = 0;
            int l = 1;
            int r1 = 1;
            Scanner sc = new Scanner(System.in);
            for(int i = 0; i <arr.length; i++){
                System.out.printf("Enter the elements in %d row",r1);
                for(int j = 0 ; j< arr.length;j++){
                    arr[i][j] = sc.nextInt();
                }
                r1++;
            }
            for(int q = 0; q < arr.length; q++){
                System.out.println(" ");               
                for(int j = 0 ; j< arr.length;j++){
                    System.out.print(arr[q][j]+" ");
                }
                
            }
            for(int q = 0; q < arr.length; q++){
               
                for(int j = 0 ; j< arr.length;j++){
                    sum = arr[q][j] + sum;
                }
                System.out.println(" ");
                System.out.printf("Sum of the element of the %d row is %d", l,sum);
                sum = 0;
                System.out.println(" ");
                l++;
            }
            
    }
}
