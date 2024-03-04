
/**
 * Write a description of class continue_break here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class continue_break
{
    public static void main(){
        System.out.println("Difference between break and continue");
        System.out.println("Break");
        for(int i = 1; i <= 10; i++){
            if(i==4)
            break;
            System.out.println(i);
        }
        System.out.println("********************************************************************************");
        System.out.println("Continue");
        for(int i = 1; i <= 10; i++){
            if(i==4)
            continue;
            System.out.println(i);
        }
    }
    
}
