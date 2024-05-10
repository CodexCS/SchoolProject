import java.util.Scanner;

public class replace_e_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        char sc2 = 'e';
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == sc2){
                System.out.print("*");
            }
            else{
                System.out.print(name.charAt(i));
            }
        }
    }
}
