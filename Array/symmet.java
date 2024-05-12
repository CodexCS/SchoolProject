import java.util.*;
/**
 * Write a description of class symmetrical_matrix here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class symmet{
    public static void main(){
        int a = 1;
        int number[][]= new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element row wise");
        int sum = 0;
        int f = 0;
        for(int i = 0;  i < 3; i++){
            System.out.printf("Entee the element in row %d", a);
            System.out.println(" ");
            for(int j = 0; j < 3; j++){


                number[i][j] = sc.nextInt();

            }
            a++;
        }
        for(int i = 0;  i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(number[i][j] != number[j][i]){
                     f = 1;   
                }
            }
            
        }
        if(f == 1){
            System.out.println("Not a symmetrical array");
        }
        else{
            System.out.println("Symmetrical array");
        }
        }
}
    