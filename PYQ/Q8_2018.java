import java.util.Scanner;

/**
 * Write a description of class Q8_2018 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q8_2018
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        int ch = sc.nextInt();
        switch(ch){
            case 1 :
                int l = 70;
                for(int i =0;i<5;i++){
                    for(int j=65; j<l;j++){
                        System.out.print((char)j);
                    }
                    System.out.println();
                    l--;
                }
                break;
            case 2:
                String sen = sc.next();
                int len = sen.length();
                int c = 0;
                for(int i=0;i<len;i++){
                    for(int j=0;j<=i;j++){
                        System.out.print(sen.charAt(c));
                    }
                    System.out.println();
                    c++;
                }
                break;
            default:
                System.out.println("Wrong option selected dude");
        }
    }
}
