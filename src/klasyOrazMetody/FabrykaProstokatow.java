package klasyOrazMetody;

/**
 * Created by Rafal Gromek ON 09.12.2018.
 */
public class FabrykaProstokatow {
    public static void main (String[] args){

        Prostokat prostokat1 = new Prostokat(10,5);
        Prostokat prostokat2 = new Prostokat(8,4);
        Prostokat prostokat3 = new Prostokat(6,3);

        Prostokat prostokatNowy = new Prostokat(5, 3, "Nowy prostokat");
     //   System.out.println(prostokatNowy.getNazwaProstokata());


        prostokatNowy.test();
        prostokatNowy.test("2 metoda test");

    }
}
