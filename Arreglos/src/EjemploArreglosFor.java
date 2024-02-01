import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {
        //crenado el arreglo de string
        String[] productos = new String[7];
        //dando valores
        productos[0] ="Kingston Pendrive";
        productos[1] ="Samsung Galaxy";
        productos[2] ="Disco Duro ssD";
        productos[3] ="Chromecast";
        productos[4] ="Asus Notebook";
        productos[5] ="Macbook";
        productos[6] ="Bicicleta";

        //ordenando el arrary
        Arrays.sort(productos);

        //reutilizar
        int total = productos.length;

        //usando for para productos
        System.out.println("=== Usando for ===");
        for(int i = 0;i<total;i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        //Usando for each
        System.out.println("=== Usando foreach ===");
        for(String pro:productos){
            System.out.println("pro =" + pro);
        }

        //Usando While
        System.out.println("=== Usando while ===");
        int i = 0;
        while (i < total){
            System.out.println("para indice " + i + " : " + productos[i]);
            i++;
        }

        //Usando do-while
        int j = 0;
        System.out.println("=== Usando do-while ===");
        do{
            System.out.println("para indice " + j + " : " + productos[j]);
            j++;
        }while(j<total);



        //creando el arreglo de numeros enteros
        int[] numeros = new int[10];

        //reciclando
        int totalNumeros = numeros.length;

        //creando con un for una tabla de multiplicacion del 3
        for(int k = 0;k<totalNumeros;k++){
            numeros[k] = k*3;
        }

        //mostrando los resultados con un for
        for(int k = 0;k<totalNumeros;k++){
            System.out.println("numero = " + numeros[k]);
        }

    }
}

