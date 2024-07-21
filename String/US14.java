import java.util.Scanner;


public class US14
{
   public static void main(){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int a = 0;
        int s = 0;
           for(int i  =0; i<st.length(); i++){
           char c  = st.charAt(i);
           
           
           if('a'<=c && c <='z'){
               
              a = (int) c;
              
              if(a == 'a'||a == 'e'||a == 'i'||a == 'o'||a == 'u'){
                  c= (char)a;
                  System.out.print(c);
              }
              else{
                  s = a-1;
                  if(s == 'a'||s == 'e'||s == 'i'||s == 'o'||a == 'u'){
                      a = a+1;
                      c = (char)a;
                      System.out.print(c);
                  }
                  else{
                      c = (char)s;
                      System.out.print(c);
                  }
              }
           }
           else{
               System.out.print(c);
            }
       }
        }
    }
