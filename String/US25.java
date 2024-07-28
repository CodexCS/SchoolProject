import java.util.*;

/**
 * Write a description of class US25 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class US25
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String country[] = new String[3];
        String capital[] = new String[3];
        System.out.println("Write the name of coutry and its coressponnfing capiral");
        for(int i =0;i <2; i++){
            country[i] = sc.nextLine();
            capital[i] = sc.nextLine();
        }
        System.out.println("Country"+"\t"+"Capital");
        for(int i =0;i <2; i++){
            char chr = country[i].charAt(0);
            if(chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u'){
                System.out.println(country[i]+"\t"+ capital[i]);
            }
        }
    }
}
