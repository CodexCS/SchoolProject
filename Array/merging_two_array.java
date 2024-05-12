import java.util.Scanner;

public class merging_two_array {
    public static void main() {
        System.out.println("Number of elements in first array");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the number of elements in second array");
        int b = sc.nextInt();
        int c = a+b;
        int arr1[] = new int[a];
        int arr2[] = new int[b];
        int arr3[] = new int[c];
        System.out.println("Enter the values of first array");
        for(int i = 0; i < a;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the values of second array");
        for(int i = 0; i < b;i++){
            arr2[i] = sc.nextInt();
        }

        for(int i = 0; i < a; i++){
            arr3[i] = arr1[i];
        }
        for(int i=0; i < b; i++){
            arr3[a+i] = arr2[i];
        }
        System.out.println("Merged Array");
        for(int i = 0; i < c;i++){
            System.out.print(arr3[i] +" ");
        }

    }
}
