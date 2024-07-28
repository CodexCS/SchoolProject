import java.util.Scanner;

/**
 * Write a description of class US29 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class US29
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String words[] = new  String[3];
        String words2[] = new  String[3];
        String reverse = "";
        for(int i  = 0; i<3; i++){
            words[i] = sc.next();
            
        }
        for(int i = 0;i <3;i++){
            int length = words[i].length();
            for(int j = length-1; j>=0; j--){
                reverse =  reverse + words[i].charAt(j);
         
            }
            if(words[i].compareTo(reverse)==0){
                System.out.println(reverse);
            }
            reverse = "";
        }
        
    }
}
