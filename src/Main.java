//import static java.lang.System.out;
//import static java.lang.System.setOut;

public class Main {
    byte i;

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        var a = 10;
        int b = 0xA;
        int d = 010;
        var f = 0.1;

//        float a = /*(int) */0.1;

        System.out.println(b);
        System.out.println(a == b);

        System.out.println(1/(float)2);

        char c = 'a';

        System.out.println(++a);
        System.out.println(++a);

//        todo "additional" ("extra"?) code
        byte i;
        for (i = 1; i > 0; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("i = " + i);
    }
}
