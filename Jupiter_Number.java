import java.util.*;

/**
 * Write a description of class Jupiter_Number here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Jupiter_Number
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int j ;
        int a = 1;
        int org = num;
        for( j=0;num>0; j++){
            num = num/10;
        }
   
        for(int i = 1;i<j;i++){
            a = a *10;
        }
        System.out.println(a);
        int fd = org/a;
        System.out.println(fd);
        int ld = org%10;
        int sum = fd+ld;
        System.out.println(sum);
        if(org%sum==0){
            System.out.println("This is a jupiter number");
        }
        else{
            System.out.println("This is not a jupiter number");
        }
    }
}
