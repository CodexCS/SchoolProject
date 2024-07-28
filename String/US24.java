import java.util.Scanner;

/**
 * Write a description of class US24 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class US24
{
   public static void main(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your choice");
        int choice = sc.nextInt();
        String str = "ICSE";
        int num = 1;
        switch(choice){
            case 1: 
               for(int i = 1; i <= 5;i++ ){
                   for(int j = 1; j<=i; j++){
                       System.out.print(num+" ");
                       num++;
                   }
                   System.out.println();
               }
                break;
                case 2: 
                    for(int i = 0;i < 4; i++){
                        for(int j=0; j<=i; j++){
                        System.out.print(str.charAt(j)+" ");    
                        }
                        System.out.println();
                    }
                    break;
        }
        
            
   }
}
