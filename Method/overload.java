import java.util.Scanner;

/**
 * Write a description of class overload here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class overload
{
    public void Number(int num, int d){
        int c = 0;
        while(num>0){
            if(num%10==d){
                c++;
            }
            num = num/10;
        }
        System.out.println(c);
    }
    public void Number(int n1){
        int sum = 0;
        int d = 0;
        while(n1>0){
             d = n1%10;
             if(d%2==0){
                 sum = sum + d;
             }
             n1 = n1/10;
        }
        System.out.println(sum);
    }
    public static void main(){
        overload ob = new overload();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int d = sc.nextInt();
        int n1 = sc.nextInt();
        ob.Number(num,d);
        ob.Number(n1);
    }
}
    

