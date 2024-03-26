import java.util.*;
/**
 * Write a description of class Pronic_number here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pronic_number
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 0;
        for(int i = 1; i<n; i++){
            if(n%i==0){
                int b = i;
                if(n == b * (b+1)){
                    f = 1;
                }
            }
        }
        if(f==1){
            System.out.println("This is a pronic number");
        }
        else{
            System.out.println("This is not a pronic number");
        }
    }
}
