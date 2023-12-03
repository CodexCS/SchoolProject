
/**
 * Write a description of class series6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class series6
{
    public static void main(){
        int a =1;
        int k = 2;
         int i = 0;
         System.out.print(a+",");
         for(i=0;i<8;i++){
              a = (a*10) + k;
              k = k + 1;
              System.out.print(a+",");
         }
    }
}
