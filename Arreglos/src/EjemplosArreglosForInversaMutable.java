import java.util.Arrays;

import java.util.Collections;

public class EjemplosArreglosForInversaMutable {
    public static void arregloInverso(String[] arreglo){
        int total2 = arreglo.length;
        int total = arreglo.length;
        for (int i =0; i <total2;i++){
            String actual = arreglo[i];
            String inverso =arreglo[total-1-i];
            arreglo[i]= inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }
    }

    public static void main(String[] args) {
        //crenado el arreglo de string
        String[] productos ={"Kingston Pendrive","Samsung Galaxy","Disco Duro ssD","Chromecast","Asus Notebook","Macbook","Bicicleta"};

        //ordenando el arrary
        Arrays.sort(productos);

        //volteando la lista
        arregloInverso(productos);

        //También se puede hacer de esta manera
        Collections.reverse(Arrays.asList(productos));

        //reutilizar
        int total = productos.length;

        //usando for para productos
        System.out.println("=== Usando for ===");
        for(int i = 0;i<total;i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }


    }
}
