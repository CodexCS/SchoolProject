import java.util.*;
/**
 * Write a description of class try7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class try7
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int min = a%10;
        int r = 0;
        while(a>0){
            r = a%10;
            if(min > r ){
                min = r;
            }
            else{
                a= a/10;
            }
            a=a/10;
            
        }
        
        System.out.println(min);
    }
}
