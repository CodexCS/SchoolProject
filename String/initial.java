import java.util.Scanner;
import java.lang.String;
public class initial {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String sn ;
        String st1 = "";
        String st2 = "";
        String st;
        int i;
        int p;
        char chr = ' ';
        System.out.println("Enter your full name");
        st = sc.nextLine();
        st = ' ' + st;
        p = st.lastIndexOf(' ');
        sn = st.substring(p); //Extract your surname
        for (i = 0; i < p; i++)
        {
            chr = st.charAt(i);
            if(chr==' '){
                st1 = st1 + st.charAt(i+1)+'.';
            }
        }
        st2 = st1 + sn;
        System.out.println("Initials with surname");
        System.out.println(st2);


    }
}
