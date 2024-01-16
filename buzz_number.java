import java.util.*;
/**
 * Write a description of class buzz_number here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class buzz_number
{
    // instance variables - replace the example below with your own
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want whether a number is buzz number");
        System.out.println("Do you wish to continue if yes press y if no press n");
        int a = sc.nextInt();
        int c  = sc.next().charAt(0);
        int i = 0;
        
        switch(c){
            case 'y':
                for(i=0;i<1;){
                    if(a%10 == 7 || a/7 == 0){
                        System.out.println("The number is a buzz number");
                        i++;
                    }
                    else
                    {
                        i = 0;
                    }
                    break;
                    
                }
            case 'n':
                System.out.println("You did not want to see whether number is buzz or not");
                break;
                
        }
    }
}
