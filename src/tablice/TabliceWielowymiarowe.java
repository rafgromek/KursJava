package tablice;

/**
 * Created by Rafal Gromek ON 04.12.2018.
 */
public class TabliceWielowymiarowe {

    public static void main (String[] args){

        // int [][] macierz2D = new int[2][4];
        int [][] macierz2D = new int[][] {
                {1,2,3,4},
                {5,6,7,8}
        };

        int x = macierz2D[1][2];

      //  System.out.println(x);

        //int [][][] macierz3D = new int[2][2][2];
        int [][][] macierz3D = new int[][][]{
                {{1,2}, {3,4}},
                {{5,6}, {7,8}}
        };

        int y = macierz3D[1][1][0];

        System.out.println(y);


    }
}
