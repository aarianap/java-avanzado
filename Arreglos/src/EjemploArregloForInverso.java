import java.util.Arrays;

public class EjemploArregloForInverso {
    public static void main(String[] args) {
        //crenado el arreglo de string
        //String[] productos = new String[7];
        String[] productos ={"Kingston Pendrive","Samsung Galaxy","Disco Duro ssD","Chromecast","Asus Notebook","Macbook","Bicicleta"};

        //dando valores
        /*-
         * productos[0] ="Kingston Pendrive";
         * productos[1] ="Samsung Galaxy";
         * productos[2] ="Disco Duro ssD";
         * productos[3] ="Chromecast";
         * productos[4] ="Asus Notebook";
         * productos[5] ="Macbook";
         * productos[6] ="Bicicleta";
         */

        //ordenando el arrary
        Arrays.sort(productos);

        //reutilizar
        int total = productos.length;

        //usando for para productos
        System.out.println("=== Usando for ===");
        for(int i = 0;i < total;i++) {
            System.out.println("para indice 1 " + i + " : " + productos[i]);
        }

        //Usando for inverso
        System.out.println("=== Usando for inverso ===");
        for(int j = 0; j < total; j++){
            System.out.println("para i = " + (total -1- j ) + " valor : " + productos[total-1-j]);
        }

        //Usando for inverso 2
        System.out.println("=== Usando for inverso II ===");
        for(int k = total -1; k >=0;k--){
            System.out.println("para i = " + k + "valor = " + productos[k]);
        }

        //
    }
}
