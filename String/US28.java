import java.util.Scanner;

/**
 * Write a description of class US28 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class US28
{
    public static void main(){
       Scanner sc = new Scanner(System.in);
       String names[] = new String[3];
       char x;
       char y;
       int k  =0;
        for(int i = 0; i < 2;i++){
            names[i] = sc.next();
        }
        for(int i = 0; i < 2;i++){
            x = names[i].charAt(0);
             y = names[i].charAt(names[i].length()-1);
            if(x != 'a'&&x != 'e'&&x != 'i'&&x != 'o'&&x != 'u'&&y == 'a'||y == 'e'||y == 'i'||y == 'o'||y == 'u')
            {
                System.out.println(names[i]);   
                k = 1;
        }
        
    }
    if(k ==0){
        System.out.println("City not found");
    }
}
}

