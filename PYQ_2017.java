import java.util.Scanner;

/**
 * Write a description of class PYQ_2017 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PYQ_2017
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String city[] = new String[5];
        
        for(int k=0;k<5;k++){
            city[k] = sc.next();
        }
        int n = city.length;
        for(int i =0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(city[j].compareTo(city[j+1])>0){
                    String temp = city[j];
                    city[j] = city[j+1];
                    city[j+1] = temp;
                }
            }
        }
        for(int k=0;k<5;k++){
            System.out.print(city[k]+" ");
        }
    }
}
