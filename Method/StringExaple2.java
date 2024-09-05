public class StringExaple2 {
    public static void main(String[] args) {

     String s = myWelcome("Good Morning","Sarika");
        System.out.println(s);
    }

    static String myWelcome(String greetings, String name) {
        return greetings + " " + name;

    }

}
