import java.util.Scanner;

/**
 * Write a description of class AUS5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AUS5
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int stu = sc.nextInt();
        String name[] = new String[stu];
        double totalmarks[] = new double[stu];
        double sum = 0;
        int c = 1;
        double avg = 0;
        double dev[] = new double[stu];
        for(int i = 0; i < stu;i++){
            System.out.println("Enter the name of student"+ c);
            name[i] = sc.next();
            System.out.println("Enter total marks");
            totalmarks[i] = sc.nextDouble();
            System.out.println("------------------------------------------------------");
            c++;
        }
        for(int i = 0; i < stu;i++){
            sum = (sum + totalmarks[i]);
        }
        avg = sum/stu;
        for(int i = 0; i < stu;i++){
            dev[i] =  totalmarks[i]- avg;
        }
        for(int i = 0; i < stu;i++){
            System.out.println("Name of student is "+ name[i]);
            System.out.println("Average marks "+ avg);
            System.out.println("Deviation "+ dev[i]);
            System.out.println("------------------------------------------------------");
        }
    }
}
