import java.util.Scanner;

/**
 * Write a description of class ArrnageInAlphabetical here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrnageInAlphabetical
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String name[] = new String[4];
        System.out.println("Write the");
        String t ="";
        for(int i =0;i <4; i++){
            name[i] = sc.next();

        }
        for(int i =0; i < 4-1; i++){
            for(int j =0; j <4-i-1; j++){ // 3 -
                if(name[j].compareTo(name[j+1]) > 0){
                    t = name[j];
                    name[j] = name[j+1];
                    name[j+1] = t;
                }
            }
        }
        for(int i = 0; i < 4; i++){
            System.out.print(name[i]+" ");
        }
    }
}
