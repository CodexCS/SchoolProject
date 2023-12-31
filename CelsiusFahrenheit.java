import java.util.*;
/**
 * Write a description of class CelsiusFahrenheit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CelsiusFahrenheit
{
    public static void main(){
        Scanner sc  = new Scanner(System.in);
        char input = sc.next().charAt(0);
        System.out.println("c for celsius to be converted to fahrenheit");
        System.out.println("f for fahrenheit to be converted to celsius");
        double ce = 0;
        double f = 0;
        double res = 0;
        
        switch(input){
            case 'f':
                System.out.println("Enter the temperature");
                ce  = sc.nextDouble();
                res = 5/9*(f-32);
                System.out.println("Temperature in Celsius is "+ res +"°C");
                break;
            case 'c':
                System.out.println("Enter the temperature");
                f  = sc.nextDouble();
                res = 1.8*(ce+32);
                System.out.println("Temperature in Fahrenheit is "+ res +"°F");
                break;
                
        }
    }
}
