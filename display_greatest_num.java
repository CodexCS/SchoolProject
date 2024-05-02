// To print the greatest number in the array
import java.util.Scanner;
public class display_greatest_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = new int[10];
        System.out.println("Enter 10 numbers in the array");
        for (int i = 0; i < 10; i++) {
            number[i] = sc.nextInt();
        }
        int max = number[0];
        for (int i = 1; i < 10; i++) {
            if (number[i] > max){
                max =number[i];
            }
        }
        System.out.println("The greatest number in the array is"+max);
    }
}
