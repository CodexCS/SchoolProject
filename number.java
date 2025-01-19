import java.util.Scanner;

/**
 * Write a description of class Q7_2022 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number
{
    void Number(int num,int d){
        int digit = 0;
        int c = 0;
        while(num>0){
            digit = num%10;
            if(d==digit){
                c++;
            }
            num = num/10;
        }
        System.out.println(c);
    }
    void Number(int n1){
        int digit = 0;
        int sum = 0;
        while(n1>0){
            digit = n1%10;
            if(digit%2==0){
                sum = sum + digit;
            }
            n1 = n1/10;
        }
        System.out.println("Sum of even digits"+ sum);
        
    }
    public static void main(){
        number ob = new number();
        ob.Number(2246);
        
    }
}
