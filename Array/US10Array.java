import java.util.Scanner;

/**
 * Write a description of class US10Array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class US10Array
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your graduation year");
        int value = 0;
        int search = sc.nextInt();
        int s = 0;
        int e = 9;
        int mid= 0;
        int k = 0;
        int year[] = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010};
        while(s<=e){
            mid = (s+e)/2;
            
            if(year[mid] < search  ){
               s= mid +1; 
            }
            else if(year[mid]  > search){
                e = mid -1;
            }
            else if(year[mid]  == search){
                k = 1;
                break;
            }
            
        }
        if(k==1){
            System.out.println("Your record exits");
        }
        else{
            System.out.println("Your record does not exits");
        }
        
    }
}
