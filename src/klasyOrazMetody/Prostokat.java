package klasyOrazMetody;

/**
 * Created by Rafal Gromek ON 09.12.2018.
 */
public class Prostokat {

    private int a, b;
    private String nazwaProstokata;


    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Prostokat(int a, int b, String nazwaProstokata) {
        this.a = a;
        this.b = b;
        this.nazwaProstokata = nazwaProstokata;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getNazwaProstokata() {
        return nazwaProstokata;
    }

    public void setNazwaProstokata(String nazwaProstokata) {
        this.nazwaProstokata = nazwaProstokata;
    }

    public void test() {
        System.out.println("hello World");
    }

    public void test (String jakisTekst) {
        System.out.println(jakisTekst);
    }

}