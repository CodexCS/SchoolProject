import java.util.Scanner;

/**
 * Write a description of class hypothetical_table here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class hypothetical_table
{
   public static void main(){
       Scanner sc = new Scanner(System.in);
       char gender = sc.next().charAt(0); 
       double inctax = 0;
       switch(gender){
           case 'f':
               System.out.println("Wrong Category");
               break;
           case 'm' :
               System.out.println("Enter your age");
               int age = sc.nextInt();
               if(age>65){
                   System.out.println("Wrong Category");
               }
               else{
                   System.out.println("Enter Taxable amount");
                   double ti = sc.nextDouble();
                   if(ti<=160000){
                       System.out.println("Nil");
                       inctax =  0;
                   }
                   else if(160000<ti&&ti<=500000){
                       inctax = (ti-160000.0) * 10.0/100.0;
                       System.out.println(inctax);
                   }
                   else if(500000<ti&&ti<=800000){
                       inctax = (ti-500000.0) * 20.0/100.0 + 34000.0;
                       System.out.println(inctax);
                   }
                   else if(800000<ti){
                       inctax = (ti-800000.0) * 30.0/100.0 + 94000.0;
                       System.out.println(inctax);
                   }
               }
       }
   }
}
