import java.util.*;
/**
 * Write a description of class nested here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//Nested If 
public class nested
{
    public static void main(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter first number");
        int m = sc.nextInt();
        System.out.println("Enter second number");
        int n  = sc.nextInt();
        if(m!=n){
           if(m>n){
            int cube = m*m*m;
            int sq = n*n;
            System.out.println("Cube of bigger number"  +cube);
            System.out.println("Square of smaller number"  +sq);
            
        }
        else{
            int cube = n*n*n;
            int sq = m*m;
            System.out.println("Cube of bigger number"  +cube);
            System.out.println("Square of smaller number"  +sq);
        } 
        }
        else{
            
            System.out.println("Both number are equall");
        }
        
    }
    
    
}
