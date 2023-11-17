import java.util.*;
/**
 * Write a description of class composite_smallestdigit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class composite_smallestdigit
{
    public static void main() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your choice ");
        System.out.println("1 if you want find whether number id prime or composite ");
        System.out.println("2 if you want find smallest digit of the number");
        int b = sc.nextInt();
        int sum = 0;
        int i = 0;
        int r = 0;
        int min = 0;
        switch(b){
            case 1:
        
            System.out.println("Enter a number ");
            int a  = sc.nextInt(); 
                    for(i=1;i<=a;i++)
            {
            if(a%i==0)
            {
              //System.out.println(i + " ");  
              sum = sum + i;
            }
        
            }
            if(sum==(a+1)){
                System.out.println("This is prime number");
            }
            else
            {
                System.out.println("This is compisite number");
            }
            break;        
                    
        
        
        case 2:
            
               System.out.println("Enter a number ");
                int n  = sc.nextInt();
                min  = n%10;
                while(n>0)
                {
                    r = n%10;
                    if(r<min){
                        min = r;
                    }

                       // min = r;
                    else{
                        n = n/10;
                    }
                    
                    //n = n/10;
                }
               System.out.println("The smallest digit is : " + min);
                break;
                    
                
            
        
        default:
                System.out.println("Pls Enter your name");
                String name = sc.next();
                System.out.println("Your are failure" + " "+ name);
            
        }
    }
}
