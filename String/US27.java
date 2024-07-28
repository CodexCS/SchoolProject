import java.util.Scanner;

/**
 * Write a description of class US27 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class US27
{
    public static void main(){
       Scanner sc = new Scanner(System.in);
       String names[] = new String[3];
        for(int i = 0; i < 2;i++){
            names[i] = sc.next();
        }
        System.out.println("Enter the character you want to search");
        char chr = sc.next().charAt(0);
        for(int i =0;i <2; i++){
            
            if(chr==names[i].charAt(0)){
                System.out.println(names[i]);
            }       
        }
    }
}
