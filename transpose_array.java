import java.util.*;
/**
 * Write a description of class transpose_array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class transpose_array
{
   public static void main(){
       System.out.println("Enter the array");
       Scanner sc = new Scanner(System.in);
       int arr[][] = new int[4][4];
       int trans[][] = new int[4][4];
       int r1 = 1;
        for(int i = 0; i <arr.length; i++){
            System.out.printf("Enter the elements in %d row",r1);
            for(int j = 0 ; j< arr.length;j++){
                    arr[i][j] = sc.nextInt();
                }
                 r1++;
            }
            System.out.println("The Orignal Array");
                System.out.println(" ");
        for(int q = 0; q < arr.length; q++){
                 System.out.println(" ");              
                for(int j = 0 ; j< arr.length;j++){
                    System.out.print(arr[q][j]+" ");
                }
                
            }
        for(int i = 0; i <arr.length; i++){

            for(int j = 0 ; j< arr.length;j++){
                    trans[j][i] = arr[i][j];
                }
                 r1++;
            }
            System.out.println(" ");  
            System.out.println("The transposed array is ");
                System.out.println(" ");
        for(int q = 0; q < arr.length; q++){
                 System.out.println(" ");              
                for(int j = 0 ; j< arr.length;j++){
                    System.out.print(trans[q][j]+" ");
                }
                
            }
   }
}
