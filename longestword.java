import java.util.Scanner;
public class longestword
{
    public static void main(){
        Scanner sc  = new Scanner(System.in);
        String st = sc.nextLine() + " ";
        String word = "";
        String long1 = "";
        String small1 = "";
        int max = 0;
        int min = 0;
        int n = st.length();
        min = n;
        
        for(int i = 0; i <st.length(); i++){

            if(st.charAt(i)!=' '){
                 word = word + st.charAt(i);   
            }
            else{
                if(word.length() > max){
                    max = word.length();
                    long1  = word; 
                    
                }
                word = "";
            }
            
        }   
        System.out.println("The longest word is" + long1);
        
        System.out.println("The length is" + max);
        for(int i = 0; i <st.length(); i++){

            if(st.charAt(i)!=' '){
                 word = word + st.charAt(i);   
            }
            else{
                if(word.length() < min){
                    min = word.length();
                    small1  = word; 
                    
                }
                word = "";
            }
            
        }   
        System.out.println("The smallest word is" + small1);
        
        System.out.println("The length is   " + min);
    }
}
