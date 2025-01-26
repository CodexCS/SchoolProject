import java.util.Scanner;

/**
 * Write a description of class ParkingLot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ParkingLot
{
    int vno,hours;
    double bill;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vehicle number ");
        vno = sc.nextInt();
        System.out.println("For how many hours do you require parking ");
        hours = sc.nextInt();
    }
    void calculate(){
        if(hours==1){
            bill = 3;
        }
        else if(hours > 1){
            bill  = 3 + (hours-1)*1.5;
        }
    }
    void display(){
        System.out.println("The vehicle number "+vno);
        System.out.println("Duration of car standing"+ hours);
        System.out.println("Amount to be paid"+bill);
    }
    public  static void main(){
        ParkingLot ob = new ParkingLot();
        ob.input();
        ob.calculate();
        ob.display();
    }
}
