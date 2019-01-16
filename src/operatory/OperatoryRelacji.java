package operatory;

/**
 * Created by Rafal Gromek ON 04.12.2018.
 */
public class OperatoryRelacji {

    public static void main(String[] args) {

        int a = 5;
        int b = 4;

        System.out.println("Wynik dzialania (rowny) 'a == b': " + (a ==b));
        System.out.println("Wynik dzialania (rozny)'a != b': " + (a != b));
        System.out.println("Wynik dzialania (wiekszy od)'a > b': " + (a > b));
        System.out.println("Wynik dzialania (mniejszy od)'a < b': " + (a < b));
        System.out.println("Wynik dzialania (wiekszy lub rowny)'a >= b':" + (a >= b) );
        System.out.println("Wynik dzialania (mniejszy lub rowny)'a <= b':" + (a <= b) );
    }
}
