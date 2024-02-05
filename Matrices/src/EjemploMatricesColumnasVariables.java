public class EjemploMatricesColumnasVariables {
    public static void main(String[] args) {
        //filas 3 columnas variables
        int[][] matriz = new int[3][];

        //creando las columnas con diferentes tamaños
        matriz[0] = new int[2];
        matriz[1] = new int[3];
        matriz[2] = new int[4];

        System.out.println("matriz lenght: " + matriz.length);
        System.out.println("fila 0 lenght" + matriz[0].length );
        System.out.println("fila 1 lenght" + matriz[1].length );
        System.out.println("fila 2 lenght" + matriz[2].length );

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0 ; j < matriz[i].length;j++){
                matriz[i][j] = i * j;
            }
        }
    }
}
