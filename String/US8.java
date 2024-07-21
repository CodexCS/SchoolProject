import java.util.Scanner;

/**
 * Write a description of class US8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class US8
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String st= sc.nextLine();
        String st2 = " "+ st;
        
        for(int i = 0; i < st2.length(); i++){
            if( st2.charAt(i) == ' '){
                 System.out.print(st2.charAt(i+1));
            }
        }
    }
}
