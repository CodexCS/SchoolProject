import java.util.Scanner;

/**
 * Write a description of class function_overload here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class function_overload
{
    Scanner sc =  new Scanner(System.in);
    double area(double a, double b, double c){
        double s = (a+b+c)/2;
        double area = s*(s-a)*(s-b)*(s-c);
        return area;
    }
    double area(int a, int b, int height){
        double area = 1/2*b*height;
        return area;
    }
    double area(double diagonal_1, double diagonal_2){
        double area = 1/2*(diagonal_1 * diagonal_2);
        return area;
    }
    void main(){
        
    }
}
