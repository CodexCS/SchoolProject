import java.util.Scanner;

public class printingletters {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Output");
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }
}
