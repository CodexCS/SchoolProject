import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int temp = 0;
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int n = array.length;
        System.out.println("Enter 10 numbers:");
        for ( i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        int m = array.length;
        for ( i = 0; i < n - 1; i++) {
            for ( j = 0; j < n  - 1; j++) {
                if (array[j] > array[j+1]) {
                    // Swap elements
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int k = 0; k < 10; k++) {
            System.out.print(array[k]+" ");
        }

    }

}
