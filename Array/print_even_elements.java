// Printing the number at even subscript
import java.util.Scanner;
public class print_even_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter 10 numbers");
            number[i] = sc.nextInt();
        }
        for (int i = 2; i < 10; i= i+2) {
                System.out.println(number[i]);
            }
        }
    }

