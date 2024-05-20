import java.util.Scanner;
/*
 * B
 * B L
 * B L U
 * B L U E
 * B L U E J
 */
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String st1 = sc.nextLine();
        for (int i = 0; i < st1.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(st1.charAt(j)+" ");
            }
            System.out.println();
        }
    }
    
}
