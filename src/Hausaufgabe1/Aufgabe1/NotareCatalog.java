import javax.swing.text.Utilities;
import java.util.ArrayList;
import java.util.Arrays;


public class NotareCatalog {
    public static int[] note_insuficiente( int[] note){
        ArrayList<Integer> lista_insuficiente = new ArrayList<>();
        for (int nota: note){
            if(nota<40){
                lista_insuficiente.add(nota);
            }
        }
       int[] rezultat= new int[lista_insuficiente.size()];
        for (int i = 0; i < lista_insuficiente.size(); i++){
            rezultat[i] = lista_insuficiente.get(i);
        }
        return rezultat;
    }

    public static double media_notelor(int[] note){
        int suma=0;
        for (int nota: note){
            suma=suma+nota;
        }
        return (double)suma/note.length;
    }

    public static int[] returneaza_note_rotunjite(int[] note){
        int[] rezultat= new int[note.length];
        for (int i = 0; i < note.length; i++){
            int nota=note[i];
            if(nota<38) {
                rezultat[i] = nota;
            }
            else{
                int formula=((nota/5)+1)*5;
                if(formula-nota<3){
                    rezultat[i]=formula;
                }
                else{
                    rezultat[i]=nota;
                }
            }
        }
        return rezultat;
    }

    public static int nota_max_rotunjita(int[] note){
        int[] note_rotunjite= returneaza_note_rotunjite(note);
        int max=note_rotunjite[0];
        for(int i=1;i<note_rotunjite.length;i++){
            if(note_rotunjite[i]>max){
                max=note_rotunjite[i];
            }
        }
        return max;
    }




    public static void main(String[] args) {
        int[] notele={29, 37, 38, 41, 84, 67};

        int[] lista_insuf= note_insuficiente(notele);
        System.out.println(Arrays.toString(lista_insuf));

        double media = media_notelor(notele);
        System.out.printf("%.2f%n", media);

        int[] note_rotunde= returneaza_note_rotunjite(notele);
        System.out.println(Arrays.toString(note_rotunde));

        int nota_maxima= nota_max_rotunjita(note_rotunde);
        System.out.println(nota_maxima);
    }
}
