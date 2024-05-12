import java.util.*;
public class Add_length {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many number you want to add");
        int size = sc.nextInt();
        int marks[] = new int[size];

        int sum = 0;

        for (int i =0;i<size;i++){
            System.out.println("Enter number");
             marks[i] = sc.nextInt();
             sum = sum + marks[i];
        }
        System.out.println("The sum of"+size+ " " +" number is"+" " + sum);


        int height[] = {1,23,45,56,25};
        // <Datatype> name = new <Datatype>[array length]
        int p;
        p = height.length;
        for(int i = 2;i<p;i++){
            System.out.println(height[i]+" ");
        }
        System.out.println("The length of the array is"+ p);
    }
}
