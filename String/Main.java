    import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String name  = "ARNAV BHAGWAT";
        int n = "arnav".indexOf('a');
        int n1 = "arnav".indexOf('a',1);
        int n3 = "international".lastIndexOf('n');
        System.out.println(n3);
        String a1 = "Arnav";
        String a2 = "Aarav";
        String a3 = "Arnav";
        String a5 = "Arnav";
        String a19 = "internet";
        String Aa19 = a19.substring(2,5);
        System.out.println("The Sub string is " + Aa19);
        boolean see = a1.equals(a2); // False
        boolean see1 = a1.equalsIgnoreCase(a2); // True
        System.out.println(see);
        System.out.println("Comparing a1 and a2");
        int m10 = a1.compareTo(a2);
        String g =  name.toLowerCase();
        String name1 = "sarika bhagwat";
        String g1 = name1.toUpperCase();
        int m = name.length();
        System.out.println(m);
        System.out.println(g);
        System.out.println(g1);
        int m5 = "malayalam".indexOf('a',1);
        System.out.println(m10);
        String b1 = "Arnav";
        String b2 = "Bhagwat";
        System.out.println("The concate string is ");
        String b3 = b1.concat(b2);
        System.out.println(b3);
    }


}