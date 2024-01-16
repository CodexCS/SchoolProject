import java.util.*;
/**
 * Write a description of class ascending_descending_num here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ascending_descending_num
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt(); 
        if(a>b&&a>c){
            System.out.print(a+" ");
            if(b>c){
                System.out.print(b+" ");
                System.out.println(c+" ");
            System.out.println(c +" "+ b +" "+ a);
            }
            else{
                System.out.print(c+" ");
                System.out.println(b+" ");
            System.out.println(b +" "+ c +" "+ a);
            }
        }
        if(b>a&&b>c){
            System.out.print(b  +" ");
            if(a>c){
                System.out.print(a+" ");
                System.out.println(c+" ");
            System.out.println(c +" "+ a +" "+ b);
            }
            else{
                System.out.print(c+" ");
                System.out.println(a+" ");
            System.out.println(a +" "+ c +" "+ b);
            }
        }
        if(c>b&&c>a){
            System.out.print(c+" ");
            if(b>a){
                System.out.print(b+" ");
                System.out.println(a+" ");
            System.out.println(a +" "+ b +" "+ c);
            }
            else{
                System.out.print(a+" ");
                System.out.println(b+" ");
            System.out.println(b +" "+ a +" "+ c);
            }
        }
    }
}
