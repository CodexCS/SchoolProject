import java.util.*;
/**
 * Write a description of class useofbreak here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class useofbreak
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        
        int i = 0;
        for(i=0;i<10;i++){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int sum = num1 + num2;
            if(sum<0){
                System.out.println("You have broken the programm lol");
                break;
                
                
            }
            else{
                System.out.println("The Sum of two number: " + sum);
            }
        }
    }
}
