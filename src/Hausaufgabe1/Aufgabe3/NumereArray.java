import java.util.Arrays;

import static java.lang.Math.abs;


public class NumereArray {

    public static long numar_creat(int[] array) {
        long numar=0;
        for(int i=0;i<array.length;i++) {
            numar+=array[i];
            numar=numar*10;
        }
        numar=numar/10;
        return numar;
    }

    public static int[] transformare_array(long numar) {
        int lungime = (int) Math.log10(numar) + 1;
        int[] array = new int[lungime];

        for (int i = lungime - 1; i >= 0; i--) {
            array[i] = (int) (numar % 10);
            numar = numar / 10;
        }

        return array;
    }


    public static long suma_numere(int[] array1, int[] array2) {
       long n1=numar_creat(array1);
       long n2=numar_creat(array2);
       return n1+n2;
    }

    public static long diferenta_numere(int[] array1, int[] array2) {
        long n1=numar_creat(array1);
        long n2=numar_creat(array2);
        return abs(n1-n2);
    }

    public static long produs_numere(int[] array1, int[] array3) {
        long n1=numar_creat(array1);
        long n3=numar_creat(array3);
        return n1*n3;
    }

    public static long impartire_numere(int[] array1, int[] array3) {
        long n1=numar_creat(array1);
        long n3=numar_creat(array3);
        return n1/n3;
    }


    public static void main(String[] args) {
        int[] numar1={1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] numar2={8, 7, 0, 0, 0, 0, 0, 0, 0};

        int[] numar3={2};

        System.out.println(numar_creat(numar1));
        System.out.println(numar_creat(numar2));

        System.out.println(Arrays.toString(transformare_array(suma_numere(numar1, numar2))));
        System.out.println(Arrays.toString(transformare_array(diferenta_numere(numar1, numar2))));

        System.out.println(Arrays.toString(transformare_array(produs_numere(numar1, numar3))));

        System.out.println(Arrays.toString(transformare_array(impartire_numere(numar1, numar3))));


    }
}
