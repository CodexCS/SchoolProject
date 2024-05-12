import java.util.*;
/**
 * Write a description of class sum_of_diagonal_element here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sum_of_diagonal_element
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[4][4];
        int sum = 0;
        int r = 1;
        int r1 = 0;
        System.out.println("Enter the array");
        for(int i = 0; i < arr.length; i++){
            System.out.printf("Enter the elements in the %d row",r++);
            System.out.println(" ");
            for(int j = 0; j < arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < arr.length; i++){
            
            for(int j = 0; j < arr.length; j++){
                if(i==j){
                    sum = sum + arr[i][j];
                }
            }
        }
        System.out.println("Sum of left diagonal" +" "+ sum);
        sum = 0;
        for(int i = 0; i < arr.length; i++){
            
            for(int j = 0; j < arr.length; j++){
                if(i+j == 3){
                    sum = sum + arr[i][j];
                }
            }
        }
        System.out.println("Sum of right diagonal"+" "+sum);
    }
}
