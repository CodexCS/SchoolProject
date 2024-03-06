    
/**
 * Write a description of class HowManyPrimeNumberbtw1to100 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HowManyPrimeNumberbtw1to100
{
    public static void main(){
        int i = 0;
        int sum = 0;
        int g = 2;
        int d = 0;
        for( g = 2; g<=100;g++){
                    sum = 0;
                 for(i=1;i<=g;i++)
                {
                if(g%i==0)
                {
                  //System.out.println(i + " ");  
                  sum = sum + i;
                }
            
            }
        
            if(sum==(g+1)){
                //System.out.println(g);
                d++;
                
            }
            
                
                
            
            }
           System.out.print(d);
            
    } 
    
}
