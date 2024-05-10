import java.util.Scanner;

public class small_to_capital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ");
        String st = sc.nextLine();
        String st1 = "";

        char chr;
        char chr1;
        for (int i = 0; i < st.length(); i++) {
            chr = st.charAt(i);
            if(st.charAt(i) >= 'a' && st.charAt(i) <= 'z' ){
                chr1 =Character.toUpperCase(chr);
                st1 = st1 + chr1;
            }else if(st.charAt(i) >= 'A' && st.charAt(i) <= 'Z'){
                chr1 =Character.toLowerCase(chr);
                st1 = st1 + chr1;
            }
            else {
                st1 = st1 + chr;
            }

        }
        System.out.println(st1);

    }
}
