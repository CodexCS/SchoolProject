import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String a  = sc.nextLine();
        int m = a.length();
        System.out.println("Reverse String");
        for (int i = m-1; i >= 0 ; i--) {
            System.out.print(a.charAt(i));
        }
    }
}
