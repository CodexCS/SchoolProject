import java.util.Scanner;

/**
 * Write a description of class Abudani_Number here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Abudani_Number
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int s = 0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                s = s + i;
            }
        }
        if(s > a){
            System.out.println("It is Abundani Number");
        }
        else{
            System.out.println("It is not a Abundani Number");
        }
    }
}
