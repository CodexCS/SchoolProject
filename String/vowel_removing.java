import java.util.Scanner;

/**
 * Write a description of class vowel_removing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class vowel_removing
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        for(int i = 0; i <st.length(); i++){
            char c = st.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                System.out.print("");
            }
            else{
                System.out.print(st.charAt(i));
            }
        }
    }
}
