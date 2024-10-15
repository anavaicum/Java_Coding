public class Cumparaturi_Markus {

    public static int tastatura_ieftina(int[] array){
        int min=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }

    public static int produs_scump(int[] array1, int[] array2){
        int max=array1[0];
        for(int i=1;i<array1.length;i++) {
            if (array1[i] > max) {
                max = array1[i];
            }
        }
        for(int j=1;j<array2.length;j++){
            if(array2[j]>max){
                max=array2[j];
            }
        }

        return max;
    }

    public static void USB_scump_Markus(int[] array, int buget){
        int max=0;
        for(int i=0;i<array.length;i++){
            if(array[i]<=buget && array[i]>max){
                max=array[i];
            }
        }
        if(max==0){
            System.out.println("Markus nu isi permite.");
        }
        else
            System.out.println(max);

    }

    public static void suma_cheltuieli_Markus(int[] array1, int[] array2, int buget){
        int sum=0;
        int max=0;
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++){
                sum=sum+array1[i]+array2[j];
                if(sum<=buget && sum>max){
                    max=sum;
                }
                sum=sum-array2[j];
            }
            sum=0;

        }
        if(max==0){
            System.out.println("-1");
        }
        else
            System.out.println(max);
    }


    public static void main(String[] args) {
        int[] tastaturi={55, 30, 45, 99, 249};
        int[] stick_USB={10, 23, 19, 39};

        int buget=45;

        System.out.println(tastatura_ieftina(tastaturi));
        System.out.println(produs_scump(tastaturi,stick_USB));

        USB_scump_Markus(stick_USB,buget);

        suma_cheltuieli_Markus(tastaturi,stick_USB,buget);
    }
}
