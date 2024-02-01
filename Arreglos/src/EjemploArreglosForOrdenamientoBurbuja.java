import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemploArreglosForOrdenamientoBurbuja {

    public static void main(String[] args) {
        //crenado el arreglo de string
        String[] productos ={"Kingston Pendrive","Samsung Galaxy","Disco Duro ssD","Chromecast","Asus Notebook","Macbook","Bicicleta"};

        //ordenando el arrary
        Arrays.sort(productos);

        //Volteando la lista
        Collections.reverse(Arrays.asList(productos));

        //reutilizar
        int total = productos.length;

        //metodo Burbuja
        int contador = 0;
        //compareTo cuando el resultado es mayor que cero > es una posicion mayor
        //cuando el resultado es negativo > en una posicion menor
        //cuando el resultado es 0 > las dos cadenas son iguales
        for(int i = 0; i < total;i++){
            for (int j = 0 ;j < total; j++){
                if(productos[i].compareTo(productos[j]) < 0) {
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
            contador++;
            }
        }
        System.out.println(contador);

        //usando for para productos
        System.out.println("=== Usando for ===");
        for(int i = 0;i<total;i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }


    }
}
