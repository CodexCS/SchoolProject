import java.util.Scanner;


public class BookFair
{
    String Bname;
    double price;
    public BookFair(){
        Bname = "";
        price = 0.0d;
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book name");
        Bname = sc.next();
        System.out.println("Enter the amt ");
        price = sc.nextDouble();
    }
    void calculate(){
        if(price<=1000){
            price = price - (0.02*price);
        }
        else if(1000<price&&price<=3000){
            price = price - (0.10*price);
        }
        else if(price>3000){
            price = price - (0.15*price);
        }
    }
    void display(){
        System.out.println("The name of the book "+Bname);
        System.out.println("Amount to be paid "+price);
    }
    public void main(){
        BookFair ob = new BookFair();
        input();
        calculate();
        display();
    }
}
