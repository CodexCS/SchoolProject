import java.util.Scanner;
public class CabService
{
    Scanner sc = new Scanner(System.in);
    String Car_type;
    double km,bill;
    CabService(){
        Car_type = "";
        km = 0.0d;
        bill = 0.0d;
    }
    void accept(){
        System.out.println("Enter car type (AC_CAR or NON_AC_CAR): ");
        Car_type = sc.next();
        System.out.println("Enter kilometers travelled: ");
        km = sc.nextDouble();
    }
    void calculate(){
        if(Car_type.equalsIgnoreCase("AC_CAR")){
            if(km<=5){
                bill = 150;
            }
            else {
                bill = 150 + (km-5)*10;
            }
        }
        if(Car_type.equalsIgnoreCase("NON_AC_CAR")){
            if(km<=5){
                bill = 120;
            }
            else {
                bill = 120 + (km-5)*8;
            }
        }
    }
    void display(){
        System.out.println("CAR TYPE" + Car_type);
        System.out.println("KILOMETER TRAVELLED "+ km);
        System.out.println("TOTAL BILL" + bill);
    }
    void main(){
        CabService ob = new CabService();
        accept();
        calculate();
        display();
        
    }
}
