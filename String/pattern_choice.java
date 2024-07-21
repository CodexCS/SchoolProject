import java.util.*;
public class pattern_choice {

    public static void main(String[] args) {
        char chr;
        int l2;
        Scanner scanner = new Scanner(System.in);
        Scanner sc =  new Scanner(System.in);
        System.out.println("Pattern 1");
        System.out.println("ABCDE");
        System.out.println("ABCD");
        System.out.println("ABC");
        System.out.println("AB");
        System.out.println("A");

        System.out.println("Pattern 2");
        System.out.println("B");
        System.out.println("LL");
        System.out.println("UUU");
        System.out.println("EEEE");
        System.out.println("JJJJJ");

        System.out.println("Pattern 3");
        System.out.println("B L U E J");
        System.out.println("B L U E");
        System.out.println("B L U");
        System.out.println("B L");
        System.out.println("B");

        System.out.println("Pattern 4");
        System.out.println("*****");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
        System.out.println("Chose Which pattern you want to print");
        int opt = sc.nextInt();
        sc.nextLine();


        switch (opt) {
            case 1:
            System.out.println("You have chosen Pattern 1");
            System.out.println("Enter number of character");
            int length = sc.nextInt();
            int j = 65;
            int length2 = j +length;
            for (int i = 1; i <= length ; i++) {
                for ( j = 65; j < length2 ; j++) {
                    chr = (char) j;
                    System.out.print(chr);
                }
                length2 = length2 -1;
                System.out.println();
            }

                
            break;
            case 2:
            System.out.println("You have chosen Pattern 2");
            System.out.println("Enter a string");
            String st1 = sc.nextLine();
            for (int i = 0; i < st1.length(); i++) {
                for ( j = 0; j <= i; j++) {
                    System.out.print(st1.charAt(i));
                }
                System.out.println();
            }
        
            case 3:
                System.out.println("You have chosen Pattern 3");
                System.out.println("Enter a string");
                 st1 = sc.nextLine();
                 int l = st1.length();
                for (int i = 0; i <= st1.length(); i++) {
                    for ( j = 0; j < l ; j++) {
                        System.out.print(st1.charAt(j));

                    }
                    l--;
                    System.out.println();
                }
            case 4:
                System.out.println("You have chosen Pattern 4");
                System.out.println("Enter number of character");
                 length = sc.nextInt();
                 int l4 = 1;
                 int z = length;
                for (int k = 1; k <= length;k++ ) {
                    for (int i = 1; i <= l4 ; i++) {
                        System.out.print(" ");
                    }
                    l4++;
                    for (int i = 1; i <= z ; i++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    z--;

                }
        }



    }

}


