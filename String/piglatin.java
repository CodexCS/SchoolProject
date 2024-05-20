import java.util.*;
public class piglatin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String s1 = sc.nextLine();
        String s2 = "";
        char chr;
        int r = 0;
        for (int i = 0; i < s1.length(); i++) {
            chr = s1.charAt(i);
           if ('a'== chr){
               r = i;
               break;
           } else if ('e'==chr) {
               r = i;
               break;
           } else if ('i'==chr) {
                r = i;
                break;
           } else if ('o' == chr) {
                r = i;
                break;
           } else if ('u'==chr) {
                r = i;
                break;
           }

        }
        for (int j = r; j < s1.length(); j++) {
            s2 = s2 + s1.charAt(j);

        }
        for (int k = 0; k < r ; k++) {
            s2 = s2 + s1.charAt(k);
        }
        s2 = s2 + "ay";
        System.out.println(s2);
    }
}
