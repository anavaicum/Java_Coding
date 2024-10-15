import javax.swing.text.Utilities;
import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.abs;


public class NumereArray {

    public static int numar_creat(int[] array) {
        int numar=0;
        for(int i=0;i<array.length;i++) {
            numar+=array[i];
            numar=numar*10;
        }
        numar=numar/10;
        return numar;
    }

    public static int suma_numere(int[] array1, int[] array2) {
       int n1=numar_creat(array1);
       int n2=numar_creat(array2);
       return n1+n2;
    }

    public static int diferenta_numere(int[] array1, int[] array2) {
        int n1=numar_creat(array1);
        int n2=numar_creat(array2);
        return abs(n1-n2);
    }

    public static int produs_numere(int[] array1, int[] array3) {
        int n1=numar_creat(array1);
        int n3=numar_creat(array3);
        return n1*n3;
    }

    public static int impartire_numere(int[] array1, int[] array3) {
        int n1=numar_creat(array1);
        int n3=numar_creat(array3);
        return n1/n3;
    }


    public static void main(String[] args) {
        int[] numar1={5, 2, 9, 7, 5, 1, 8};
        int[] numar2={2, 5, 8, 3, 9, 1, 6};

        int[] numar3={2};

        System.out.println(numar_creat(numar1));
        System.out.println(numar_creat(numar2));

        System.out.println(suma_numere(numar1, numar2));
        System.out.println(diferenta_numere(numar1, numar2));

        System.out.println(produs_numere(numar1, numar3));
        System.out.println(impartire_numere(numar1, numar3));

    }
}
