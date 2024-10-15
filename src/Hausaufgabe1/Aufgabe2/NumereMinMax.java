import javax.swing.text.Utilities;
import java.util.ArrayList;
import java.util.Arrays;


public class NumereMinMax {
    public static int gasire_maxim(int[] numere){
        int max = numere[0];
        for (int i = 1; i < numere.length; i++) {
            if (numere[i] > max) {
                max = numere[i];
            }
        }
        return max;
    }

    public static int gasire_minim(int[] numere){
        int min = numere[0];
        for (int i = 1; i < numere.length; i++) {
            if (numere[i] < min) {
                min = numere[i];
            }
        }
        return min;
    }

    public static int suma_fara_minim(int[] numere){
        int sum = 0;
        for (int i = 0; i < numere.length; i++) {
            sum += numere[i];
        }
        int min=gasire_minim(numere);
        sum = sum - min;
        return sum;
    }

    public static int suma_fara_maxim(int[] numere){
        int sum = 0;
        for (int i = 0; i < numere.length; i++) {
            sum += numere[i];
        }
        int max=gasire_maxim(numere);
        sum = sum - max;
        return sum;
    }


    public static void main(String[] args) {
        int[] numere={9, 39, 55, 12, 6, 97, 231};

        System.out.println(gasire_maxim(numere));

        System.out.println(gasire_minim(numere));

        System.out.println(suma_fara_minim(numere));

        System.out.println(suma_fara_maxim(numere));
    }
}
