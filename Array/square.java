/* Array1   Array2
    1          1
    2          4
    3          9
 */
import java.util.Scanner;
public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = new int[10];
        int square[] = new int[10];
        int num_sq = 0;
        int i = 0;
        System.out.println("Enter 10 number");
        for ( i = 0; i < 10; i++) {
            number[i] = sc.nextInt();
        }
        for ( i = 0; i < 10; i++) {
            num_sq = number[i] * number[i];
            square[i] = num_sq;
            System.out.println(square[i]);
        }
        System.out.println("Array1 \t Array2");
        for ( i = 0; i < 10; i++) {
            System.out.println(number[i]+"\t"+"\t"+square[i]);
        }


    }
}
