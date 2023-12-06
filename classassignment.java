import java.util.*;
/**
 * Write a description of class classassignment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class classassignment
{
    public static void main(){
        System.out.println("Volume of which 3d Shape you want to find");
        System.out.println("Press 1 to find volume of a cuboid");
        System.out.println("Press 2 to find volume of a cyclinder");
        System.out.println("Press 3 to find volume of a cone");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your choice");
        int opt = sc.nextInt();
        final double  π = 3.1415;
        double h = 0; 
        double volume = 0 ;
        double r = 0;
        double l = 0;
        double b = 0;
        
        switch(opt){
            case 1:
                System.out.println("Enter the the length");
                l = sc.nextDouble();
                System.out.println("Enter the the breadth");
                b = sc.nextDouble();
                System.out.println("Enter the the height");
                h = sc.nextDouble();
                volume = l*b*h;
                System.out.println("The Volume of cuboid is: " + volume);
                break;
            case 2 :
                System.out.println("Enter the the radius");
                r = sc.nextDouble();
                System.out.println("Enter the the height");
                h = sc.nextDouble();
                volume = π*r*r*h;
                System.out.println("The Volume of cyclinder is: " + volume);
                break;
            case 3 :
                System.out.println("Enter the the radius");
                r = sc.nextDouble();
                System.out.println("Enter the the height");
                h = sc.nextDouble();
                volume = 1/3*π*r*r*h;
                System.out.println("The Volume of cone is: " + volume);
        }
    }
}
