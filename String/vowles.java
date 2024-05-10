import java.util.Scanner;

public class vowles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int m = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)== 'a'){
                m++;
            }
            if (word.charAt(i)== 'e'){
                m++;
            }
            if (word.charAt(i)== 'i'){
                m++;
            }
            if (word.charAt(i)== 'o'){
                m++;
            }
            if (word.charAt(i)== 'u'){
                m++;
            }

        }
        System.out.println("The number of vowels are"+ " "+ m);
    }
}
