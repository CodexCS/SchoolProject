import java.util.Scanner;

public class selection_sort {
    public static void main(String[] args) {
        int number[] = new int[10];
        System.out.println("Enter 10 numbers");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            number[i] = sc.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            int min = i;
            for (int j = i+ 1; j < 10; j++) {
                if (number[j] < number[min])
                    min = j;
            }
            int temp = number[i];
            number[i] = number[min];
            number[min] = temp;
        }
        System.out.println("The Sorted array is");
        for (int i = 0; i < 10; i++)
            System.out.print(number[i] + " ");
    }
}
