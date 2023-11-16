import java.util.*;
/**
 * Write a description of class automorphicnum2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class automorphicnum2
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int b = 0;
        int sq = a*a;
        do{
        if(a%10!=sq%10){
            b = 1;
            break;

        }
        else{
            sq = sq/10;
            a = a/10;
            
        } 
        }
        while(a>0);
        if(b==0){
            System.out.println("This  an automorphic");
        }
        else{
            System.out.println("This is not an  anuto number");
        }
    }
}
