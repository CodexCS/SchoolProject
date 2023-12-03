
/**
 * Write a description of class series1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * 0,1,2,3,6...... series1
 */
public class series1
{
    public static void main(){
        int a = 0;
        int b = 1;
        int c  = 2;
        int i = 0;
        System.out.print(a + " ");
        System.out.print(b + " ");
        System.out.print(c + " ");
        for(i=0;i<10;i++ ){
            int d = a + b + c;
            System.out.print(d+ " ");
            a = b;
            b = c;
            c = d;
            
        }

    }
}
