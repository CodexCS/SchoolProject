import java.util.*;
/**
 * Write a description of class Q8_2017 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q8_2017
{
    void check(String str, char ch){
        int c = 0;
        for(int i=0;i<str.length();i++){
            if(ch == str.charAt(i)){
                c++;
            }
        }
        System.out.println("Number of "+ch+" present "+c);
    }
    void check(String s1){
        String s2 = s1.toLowerCase();
        
        for(int i=0;i<s2.length();i++){
            char ch = s2.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.print(ch+" ");
            }
        }
    }
    public static void main(){
        Q8_2017 ob= new Q8_2017();
        Scanner sc = new Scanner(System.in);
        //  No need for writng the vaules I did it for checking purposes
        ob.check("success",'c');
        ob.check("computer");
        
        
        
    }
}
