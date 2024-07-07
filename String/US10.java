import java.util.Scanner;

/**
 * Write a description of class US10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class US10
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String st  = sc.nextLine();
        int index = st.lastIndexOf(" ");
        for(int i = index+1; i < st.length(); i++){
            System.out.print(st.charAt(i));
        }
        System.out.print(" ");
        for(int i = 0; i < index; i++){
            System.out.print(st.charAt(i));
        }
    }
}
