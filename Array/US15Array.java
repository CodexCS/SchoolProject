import java.util.Scanner;

/**
 * Write a description of class US15Array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class US15Array
{
    public static void main(){
        int sum= 0;
        int product = 0;
        Scanner sc = new Scanner(System.in);
        int N[][]= new int[4][4];   
        for(int i = 0; i <4; i++){
            for(int j = 0; j <4; j++){
                N[i][j]= sc.nextInt();
            }
        }
        
        for(int i = 0; i <4; i++){
            for(int j = 0; j <4; j++){
                if(N[i][j]/2==0){
                    sum = sum + N[i][j];
                     
                }
                else if(N[i][j]/2 != 0){
                    product = product * N[i][j];
                }
            }
            System.out.println();
        }
        
        System.out.println("Sum of even number in the array"+sum);
        System.out.println("Product of odd number in the array"+product);
    }
}
