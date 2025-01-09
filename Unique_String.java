import java.util.Scanner;

/**
 * Write a description of class Unique_String here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unique_String
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int len = word.length();
        int k = 0;
        for(int i =0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                if(word.charAt(i)==word.charAt(j)){
                    k =1;
                }
            }
        }
        if(k==0){
            System.out.println("This is unique string ");
        }
        else{
            System.out.println("This not a unique string");
        }
    }
}
