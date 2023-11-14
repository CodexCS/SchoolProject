import java.util.*;
import java.lang.Math;
/**
 * Write a description of class perimeterarea here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class perimeterarea
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        int l = sc.nextInt();
        System.out.println("Enter the bredth of rectangle: ");
        int b =sc.nextInt();
        System.out.println("Enter 1 for Perimeter");
        System.out.println("Enter 2 for area " );
        System.out.println("Enter 3 for diagonal ");
        int opt = sc.nextInt();
        int area = 0;
        int peri = 0;
        double diagonal = 0;
        switch(opt)
        {
            case 1:
                 peri = 2*(l+b); 
                 System.out.println("Perimeter of the rectangle =" +peri);
                 break;
            case 2:
                 area = l*b;
                 System.out.println("Area of the rectangle =" +area);
                 break;
            case 3:
                diagonal = Math.sqrt(Math.pow(l,2) + Math.pow(b,2));
                System.out.println("Diagonal of the rectangle =" +diagonal);
                break; /// optional not required for the last statment
            
        }
    }
}
