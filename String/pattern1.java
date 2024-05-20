import java.util.Scanner;
/*
 * B L U E J
 *   B L U E
 *     B L U
 *       B L
 *         B
 */
public class pattern1 {
        public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a strin");
        String st1 = sc.nextLine();
        int a = 0;
        int b = st1.length();
        int p= 0;
        int k= 0;
        for ( a = b;a >=0  ; a--) { 
            for ( p = 1; p <=k; p++) {
                System.out.print(" ");
            }
            System.out.println(st1.substring(0,a));
            k++;
        }
        
            
        }

    
}
