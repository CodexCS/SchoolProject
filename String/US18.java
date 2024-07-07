import java.util.Scanner;

public class US18
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int j = 0; 
        String p = "";
        for(int i =0; i < word.length(); i++){
            if(word.charAt(0)==word.charAt(word.length()-1)){
                System.out.println("Specail Word");
            }
            else {
            for ( j = word.length() - 1; j >= 0; j--) {
             p = p + j;
            }
            if(p.equals(word)){
                
                System.out.println("Palindrome word");
            }
        }
    }
    }
}
