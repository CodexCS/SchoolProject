import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the string");
        String a = sc.nextLine();
        int m = a.length();
        String b  = "";
        for (int i = m-1; i >= 0 ; i--) {

              b = a.charAt(i)+b;

        }
        boolean f = b.equalsIgnoreCase(a);
        if (f == true){
            System.out.println("This is palindrome");
        }
        else {
            System.out.println("This is not a palindrome number");
        }

    }
}
