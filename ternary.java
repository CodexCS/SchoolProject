import java.util.*;
public class ternary
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b  = sc.nextInt();
        int c  = sc.nextInt ();
        int max = 0;
        if((a==b)&&(a==c))
        {
            
            
            System.out.println("Numebers are equal");
            if(a>0&&b>0&&c>0)
            {
                System.out.println("Numbers are positive");
                
            }
            else if(a<0&&b<0&&c<0)
            {
                System.out.println("Numbers are negative");
            }
            else{
                System.out.println("Conbination of positve an negative");
            }
        }
        
        else
        {   
           
           System.out.println("All are equal");
        }
    }
}