package AVN;
import java.util.Scanner;
public class Q7
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row ");
        int r = sc.nextInt();
        System.out.println("Enter the number of column ");
        int c = sc.nextInt();
        char arr[][] = new char[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.next().charAt(0);
            }
        }
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        int cont = 1;
        int max = arr[0][0];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
            System.out.println("Maximum ASCII value of element in"+ cont + " row "+ (char)max);
            cont++;
            max = 0;    
        }
        
    }
}
