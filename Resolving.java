import java.util.Scanner;

/**
 * Write a description of class Resolving here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Resolving
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String st = sc.nextLine();
        System.out.println("Enter F for printing first letter of every letter");
        System.out.println("Enter L for printing last letter of every letter");
        char opt = sc.next().charAt(0);
        String sp = " "+ st;
        String spl = st + " ";
        char s = ' ';
        switch(opt){
            case 'F':
                for(int i = 0; i<sp.length(); i++){
            if(sp.charAt(i)==' '){
                s = sp.charAt(i+1);
                System.out.println(s);
            }
            s = ' ';
        
        }
        break;
        case 'L':
        for(int i = 0; i < spl.length(); i++){
            if(spl.charAt(i+1)==' '){
                s = spl.charAt(i-1);
                System.out.println(s);
            }
            s = ' ';
                }
        break;
        default:
            System.out.println("Wrong Choice☻");
        }
        
    }
}
