import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = {12,34, 56, 67,56,65,44,23,24,78,69};
        int m = number.length;
        int f = 0;
        System.out.println("Enter number you want to search");
        int search = sc.nextInt();
        for(int i = 0; i < m; i++) {
                if(number[i]==search){
                    f = 1;
                    break;
                }
        }
        if (f==1){
            System.out.println(search+"  "+"is present in the array");
        }
        else {
            System.out.println(search+"  "+"is not present in the array");
        }

        }
}
