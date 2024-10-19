package Prelims;
import java.util.*;

/**
 * Write a description of class MovieMagic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class movieMagic
{
    int year;
    String title;
    float rating;
    String review;
    movieMagic(){
        year = 0;
        title = "";
        rating = 0.0f;
    }
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Title of the Movie");
        title = sc.nextLine();
        System.out.println("Enter the year of release");
        year = sc.nextInt();
        System.out.println("Enter your ratings");
        rating = sc.nextFloat();
    }
    void display(){
        if(rating>=0.0 && rating<=2.0){
            review = "Flop";
        }
        else if(rating>=2.1 && rating <=3.4){
            review = "Semi-Hit";
        }
        else if(rating>=3.5 && rating <=4.5){
            review = "Hit";
        }
        else if(rating>=4.6 && rating <=5.0){
            System.out.println("hello world");
            review = "Super Hit";
        }
        System.out.println("Title of the Movie is "+ title);
        System.out.println("It is "+ review);
    }
    public static void main(){
        movieMagic ob =  new movieMagic();
        ob.accept();
        ob.display();
    }
}
