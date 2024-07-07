import java.util.Scanner;

/**
 * Write a description of class US14 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class US14
{
   public static void main(){
       Scanner sc = new Scanner(System.in);
       String st = sc.nextLine();
       for(int i  =0; i<st.length(); i++){
           char c  = st.charAt(i);
           
           if('a'<=c && c <='z'){
               if(c-1  == 'a'|| c-1 == 'e'||c-1 =='i'||c-1 == 'o'| c-1 == 'u' )
               char  e = (char)c+1;
                System.out.print(c+1);

               else{
                System.out.print(c-1)c;

               }
           }
           else if(c == 'a'|| c== 'e'||c =='i'||c == 'o'| c == 'u'){
               System.out.print(c);
           }
       }
   }
}
