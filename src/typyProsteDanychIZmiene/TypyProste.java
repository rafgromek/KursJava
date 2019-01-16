package typyProsteDanychIZmiene;

/**
 * Created by Rafal Gromek ON 02.12.2018.
 */
public class TypyProste {

    public static void main (String[] args){

        //zapisz czas na poczatku.
        long start = System.currentTimeMillis();

        //odliczaj od 0 do10^9 i dodaja do siebie odliczane wartosci
        long sum = 0L;
        for(long i = 0; i <=1000000000; i++){

        }
        System.out.println("suma wynosi:" + sum);

        //zapisz czas na koncu.

        long stop = System.currentTimeMillis();

        //wyswietl czas wykonania
        System.out.println("Czas wykonania w ms" + (stop - start));


    }
}
