import java.util.*;
/**
 * Write a description of class forgrading2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class forgrading2
{
    public static void main(){
              
         
        Scanner sc  = new Scanner(System.in);
        int i = 0;
        int roll = 0;
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        int sum = 0;
        String g = "";
        
        
        for(i=0;i<3;i++)
      {
                  System.out.println("Enter the name of the student " );
                 String name = sc.next();
                  
                  System.out.println("Enter the Roll No. student " );
                  roll = sc.nextInt();
                  
                  System.out.println("Enter the marks for student "+ name);
                            
                  System.out.println("Enter the marks of maths ");
                  s1 = sc.nextInt();
                  
                  System.out.println("Enter the marks of hindi ");
                  s2 = sc.nextInt();
                  
                  System.out.println("Enter the marks of english ");
                  s3 = sc.nextInt();
                  
                   sum  = s1 + s2 + s3 ;
                  if(101<=sum && sum<=150)
                  {
                      g = "A";
                  }
                  else if ( 71<=sum && sum<100){
                      g = "B";
                  }
                  else if ( 51<=sum && sum<=70){
                      g = "c";
                  }
                  else if (41 <=sum && sum<=50){
                      g = "d";
                  }
                  else if(sum < 41){
                      g = "gharat bhandi gasat bas!!!!! ";
               
                    }
            
              System.out.println("Your name is " + name);
              System.out.println("Your roll no is " + roll);
              System.out.println("Your total is " + sum);
              System.out.println("Your grade is " + g);
              System.out.println("-------------------------------------------------");
              
        }
    }
}
