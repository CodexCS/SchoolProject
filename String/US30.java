import java.util.Scanner;

/**
 * Write a description of class US30 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class US30
{
   public static void main(){
        Scanner sc = new Scanner(System.in);
        String country[] = new String[3];
        int num[] = new int[3];
        System.out.println("Write the name of coutry and its coressponnfing phone");
        for(int i =0;i <2; i++){
            country[i] = sc.next();
            num[i] = sc.nextInt();
        }
        System.out.println("Enter city you want to search");
        String search = sc.nextLine();
        System.out.println("Country"+"\t"+"\t"+"PhoneNumber");
        for(int i =0;i <2; i++){
            char chr = country[i].charAt(0);
            if(search.equalsIgnoreCase(country[i])){
                System.out.println("Search Succesful");
                System.out.println(country[i]+"\t"+ num[i]);
            }
            else{
                System.out.println("Search Unsuccesful");
            }
        }
    }
}
