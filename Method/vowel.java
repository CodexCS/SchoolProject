import java.util.Scanner;

public class vowel {
    public void vowelFinder(String st1){
        for (int i = 0; i < st1.length(); i++) {
            char c = st1.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                System.out.println("Vowles Present"+" "+ c);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a s string");
        String st2 = sc.nextLine();
        vowel ob = new vowel();
        ob.vowelFinder(st2);
    }
}
