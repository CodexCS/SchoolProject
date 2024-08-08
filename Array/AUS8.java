import java.util.*;

/**
 * Write a description of class AUS8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AUS8
{
    public static void main(){
        Scanner sc  = new Scanner(System.in);
        int arr[] = new int[5];
        int Oarr[] = new int[5];
        int Earr[] = new int[5];
        for(int i =0; i <5; i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0; i <5; i++){
            if(arr[i]%2==0){
                Earr[i] = arr[i];
            }
            else{
                Oarr[i] = arr[i];
            }
        }
        for(int i =0; i <5; i++){
            if(Oarr[i] == 0){
                continue;
            }
            System.out.print(Oarr[i]+" ");
        }
        System.out.println();
        for(int i =0; i <5; i++){
            if(Earr[i] == 0){
                continue;
            }
            System.out.print(Earr[i]+" ");
        }
    }
}
