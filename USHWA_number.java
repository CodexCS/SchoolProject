import java.util.Scanner;

/**
 * Write a description of class USHWA_number here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class USHWA_number
{
    public static void main(){
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int fd = num/1000;
        int ld = num%10;
        int d = 0;
        int sumd = 0;
        if(num>999&&num<10000){
            for(;num>0;){
            d = num%10;
            sumd = sumd + d;
            num = num/10;
            }
        }
        else{
            System.out.println("This not 4 digit");
            System.exit(0);
        }
        if(sumd==2*(fd+ld)){
            System.out.println("This USHWA");
        }
        else{
            System.out.println("This not USHWA");
        }
    }
}
