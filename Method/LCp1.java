import java.util.Scanner;

public class LCp1 {
    public int sumOfTwo(int g,int h){
        int sum =   g +h;
        return (sum);
    }
    public int subtractOfTwo(int a,int b){
        int subtract =   a - b;
        return (subtract); // Sends the value to Method Caller
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        LCp1 ob = new LCp1(); // Objects are created to access all function present in the class
        int sum1 = ob.sumOfTwo(a,b); // Method Caller return statment sends the value here
        System.out.println("The sum of two numbers"+ sum1);
        int sub1 = ob.subtractOfTwo(a,b);

    }
}
