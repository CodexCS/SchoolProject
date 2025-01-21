import java.util.*;

/**
 * Write a description of class Q8_2019 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q8_2019
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String sen = sc.nextLine();
        String sen1 = " "+sen;
        String usen1 = sen1.toUpperCase();
        System.out.println(usen1);
        int num = usen1.length();
        int c = 0;
        for(int i=0;i<num;i++){
            char ch = usen1.charAt(i);
                if(ch == ' ' && usen1.charAt(i+1)=='A'){
                    c++;
            }
            
        }
        System.out.println("Total number of letters starting with A "+ c);
    }
}
