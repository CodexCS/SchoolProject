import java.util.*;
public class binarysearch {
    public static void main(String[] args) {
        int number[] = {1,2,3,7,10,13,17,21,22,37,48,49,50,61};
        Scanner sc = new Scanner(System.in);
        int target = 6;
        int start = 0;
        int end = 13;
        int middle = 0;
        int f = 0;
        while(start<=end){
            middle =  (start+end)/2;
            if (number[middle]==target){
                f = 1;
                break;
            }
            if(number[middle]>target){
                end = middle - 1;
            }
            if (number[middle]<target){
                start = start + 1;
            }
        }
        if (f==1){
            System.out.println("Number found");
        }
        else {
            System.out.println("Number not found");
        }

    }
}
