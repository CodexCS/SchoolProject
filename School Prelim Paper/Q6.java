package AVN;
import java.util.Scanner;


/**
 * Write a description of class Q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q6
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sqnum = num*num;
        int rnum = 0;
        while(num>0){
            int d = num%10;
            num = num/10;
            rnum = rnum*10 + d;
        }
        int sqrnum = rnum*rnum;
        System.out.println("A "+sqrnum);
        int osqnum = 0;
        while(sqnum>0){
            int d1 = sqnum%10;
            sqnum = sqnum/10;
            osqnum = osqnum*10 + d1;
        }
        System.out.println("B "+osqnum);
        if(osqnum==sqrnum){
            System.out.println("This is Adam Number");
        }
        else{
            System.out.println("This is not a Adam Number");
        }
        }
        
    }

