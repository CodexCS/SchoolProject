import java.util.*;
public class inserting {
    public static void main() {
        int number[] = new int[50];
        System.out.println("Enter the number of elements in the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }
        System.out.println("The elements are");
        for (int i = 0; i < n; i++) {
            System.out.println(number[i]+" ");
        }

        System.out.println("Enter which element you want to insert");
        int insert = sc.nextInt();
        System.out.println("Enter the position where you want to insert the number");
        int pos = sc.nextInt();
        for(int i = n-1; i >= pos; i--){
            number[i+1] = number[i];
        }
        number[pos] = insert;
        n++;
        System.out.println("The New array is");
        for(int u = 0 ; u < n; u++){
            System.out.println(number[u]+" ");
        }







    }
}
