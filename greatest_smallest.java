import java.util.*;
/**
 * Write a description of class greatest_smallest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class greatest_smallest
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        
        int arr[][]  =  new int [3][3];
        int temp = 0;
        int min = 0;
        int max = 0;
        int r1 = 1;
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
            System.out.println(" "); 
        min = arr[0][0];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                temp = arr[i][j];
                if(temp < min){
                    min = temp;
                }
            }
        }   
        System.out.println(" ");
        System.out.println("The smallest array element in the array is" + min);
        
        max = arr[0][0];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                temp = arr[i][j];
                if(temp > max){
                    max = temp;
                }
            }
        }   
        System.out.println("The largest element in the array is" + max);
    }
}
