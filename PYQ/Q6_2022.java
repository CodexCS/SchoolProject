import java.util.Scanner;

/**
 * Write a description of class Q6_2022 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q6_2022
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[3];
        int len = 0;
        for(int i=0;i<3;i++){
            arr[i] = sc.next();
        }
        for(int i=0;i<3;i++){
             len  = arr[i].length();
             char l = arr[i].charAt(len-1);
             char f = arr[i].charAt(0);
             if((f=='a')||(f=='A')&&(l=='a')|(l=='A')){
                 System.out.println(arr[i]);
             }
        }
    }
}
