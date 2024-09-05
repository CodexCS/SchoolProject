import java.util.Scanner;

public class odd_even {
    public int num(int z ){
        if(z%2==0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the number");
        int y = sc.nextInt();
        odd_even ob = new odd_even();
        int show = ob.num(y);
        System.out.println(show);
    }
}
