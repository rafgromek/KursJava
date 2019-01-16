package operatory;

/**
 * Created by Rafal Gromek ON 05.12.2018.
 */
public class OperatoryTrujargumentowy {

    public static void main(String[] args) {

        int a = 3;
        int b = 1;

        int c = (a > b) ? 10 : 0;

        System.out.println((a > b) ? "tak" : "nie");

        System.out.println(jestWiekszeOd(a, b) ? pomnuzPrzezSto(a) : pomnuzPrzezSto(b));
    }

    public static int pomnuzPrzezSto(int wartosc) {
        return wartosc * 100;
    }

    public static boolean jestWiekszeOd(int a, int b) {

        return a >b;

    }
}
