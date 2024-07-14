import java.util.Scanner;

/**
 * Write a description of class US13Array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class US13Array
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String name[] = new String[2];
        int mkP[] = new int [2];
        int mkC[] = new int [2];
        int mkM[] = new int [2];
        int roll[] = new int [2];
        double avg[] = new double[2];
        int total= 0;
        int k = 1;
        for(int i = 0; i < 2; i++){
            System.out.println("Enter name of Student "+ k);
            name[i] = sc.next();
            System.out.println("Enter marks of student "+ k+" in Physics");
            mkP[i] = sc.nextInt();
            System.out.println("Enter marks of student "+ k+" in Chemistry");
            mkC[i] = sc.nextInt();
            System.out.println("Enter marks of student "+ k+" in Maths");
            mkM[i] = sc.nextInt();
            System.out.println("Enter roll no.");
            roll[i] = sc.nextInt();
            k++;
        }
        for(int i = 0; i < 2; i++){
            avg[i] = (mkP[i] + mkC[i] + mkM[i])/3;
        }
        for(int i = 0; i < 2; i++){
            if(80<=avg[i]&&avg[i]<=100){
                System.out.println("The name is"+ name[i]);
                System.out.println("Enter roll no."+roll[i]);
              System.out.println("Excellent");  
            } 
            if(75<=avg[i]&&avg[i]<=84){
                System.out.println("The name is"+ name[i]);
                System.out.println("Enter roll no."+roll[i]);
              System.out.println("Distinction");  
            }
            if(60<=avg[i]&&avg[i]<=74){
                System.out.println("The name is"+ name[i]);
                System.out.println("Enter roll no."+roll[i]);
              System.out.println("First class");  
            }
            if(40<=avg[i]&&avg[i]<=59){
                System.out.println("The name is"+ name[i]);
                System.out.println("Enter roll no."+roll[i]);
              System.out.println("pass");  
            }
            if(40>avg[i]){
                System.out.println("The name is"+ name[i]);
                System.out.println("Enter roll no."+roll[i]);
              System.out.println("Failure");  
            }
        }
    }
}
