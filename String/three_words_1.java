import java.util.Scanner;

public class three_words_1 {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            for (int i = 0; i <name.length() ; i++) {
                
                if (i==0) {
                    System.out.print(name.charAt(i));
                    System.out.print(name.charAt(1));
                    System.out.print(name.charAt(2));
                    System.out.println();
                    System.out.print(name.charAt(i));
                    System.out.print(name.charAt(2));
                    System.out.print(name.charAt(1));
                    System.out.println();
                }
                if (i==1) {
                    System.out.print(name.charAt(i));
                    System.out.print(name.charAt(0));
                    System.out.print(name.charAt(2));
                    System.out.println();
                    System.out.print(name.charAt(i));
                    System.out.print(name.charAt(2));
                    System.out.print(name.charAt(0));
                    System.out.println();

                }
                if(i==2) {
                    System.out.print(name.charAt(i));
                    System.out.print(name.charAt(0));
                    System.out.print(name.charAt(1));
                    System.out.println();
                    System.out.print(name.charAt(i));
                    System.out.print(name.charAt(1));
                    System.out.print(name.charAt(0));
                    System.out.println();

                }
            }

    }
}