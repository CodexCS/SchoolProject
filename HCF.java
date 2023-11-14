import java.util.*;
/**
 * Write a description of class HCF here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HCF
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i = 1;
        int hcf = 0;
        int l = n*m;
        for(i=1;i<l;i++){
            if(n%i==0 && m%i==0){
                hcf = i;
            }
        }
        System.out.println("The HCF of two number is" + hcf);
    }
    
}
