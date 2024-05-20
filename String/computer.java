import java.util.Scanner;

/**
 * three_word
 */
public class computer {

    public static void main(String[] args) {
        String st = "COMPUTER";
        StringBuffer st1 = new StringBuffer(st);
        int p = st.length();
        System.out.println(st);
        for (int i = 0; i < p-2; i++) {
            System.out.println(st.charAt(i+1) +"      "+st.charAt(p-2-i));
        }
        System.out.println(st1.reverse());
    }
}