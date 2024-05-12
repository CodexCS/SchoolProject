import java.util.*;
public class user_input_double_dimensional_array
{
    public static void main(){
        int a = 1;
        int number[][]= new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element row wise");
        int sum = 0;
        
        for(int i = 0;  i < 3; i++){
            System.out.printf("Entee the element in row %d", a);
            System.out.println(" ");
            for(int j = 0; j < 3; j++){
                
                
                number[i][j] = sc.nextInt();
                
            }
            a++;
        }
        
        for(int i = 0; i < 3; i++){
            System.out.println();
            for(int j = 0; j < 3; j++){
                sum = sum + number[i][j];
                System.out.print(number[i][j]+" ");
            }
        }
        System.out.println(" ");
        
        System.out.println("The sum of elements of the array is" +sum);
        
    }
}
