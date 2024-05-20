import java.util.Scanner;
 
public class pattern2 {
    /**
     * 
     */
    public static void main(String[] args) {
        int n = 2;
        int f = 0;
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int l = st.length();
        int l2 = st.length();
        for (int i = 0; i < l2; i++) {
            System.out.print(st.substring(i, l2));
            System.out.print(st.substring(0, i));
            System.out.println();

        }

    
    }
}