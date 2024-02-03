//Matrices
/* Que son las matrices?
 * Son arreglos bidimensionales, donde cada uno de sus elementos es a su vez un
 * arreglo en su segunda dimension.
 * Esto permite que no todos los elementos tengan el mismo tamaño.
 * De esta forma es posible crear matrices recursivas y multi-dimensionales
 * (un aarreglo compuesta de otros arreglos)
 */

//Representacion
/*
 * 0    1   2   3   4   5   6  →Total de columnas length = 6
 * 1    20  22  24  26  28  30
 * 2    31  33  35  37  39  40 →Número 40 se encuentra en la posicion[2][6]
 * 3    50  60  70  80  90  100
 * ⬆->total de filas, length = 4
 */

//Declaracion e instanciacion
/*-La declaracion de una matris tine dos partes: el tipo de datos del arreglo
 * seguido de dobles corchetes y el nombre de la variable
 *
 * Ejemplo:
 *
 * int[][] numeros;  - o bien- int[][] numeros;
 *
 * -Al igual que el tipo array incluye el tipo de dato de los elmentos que va contener.
 *
 * -Cuando se crea una matriz, se utiliza el operador new, mas el tipo de los elementos
 * mas el numero de filas y columnas.
 *
 * Ejemplo:
 *
 * int[][] numeros = new int[fila][columna];
 *
 * int[][] numeros = new int[6][4]
 */

//Tamaños de filas y columnas
/* Como en los arreglos, podemos obtener el tamaño de la matriz
 * con el atributo length, tanto para las filas y columnas.
 *
 * Ejemplo:
 * int[][] numeros = new int[2][3];
 * System.out.println("numero de fila = " + numeros.length);
 * System.out.println("numero de columnas = " + numeros[0].length);
 */

//Inicializacion de elementos
/* -Asignamos elementos a la matriz indicando la llave o indice de la fila y de la columna
 *
 * Ejemplo:
 * int[][] numeros = new int[2][4]
 *
 * numeros[0][0] = 1 ;
 * numeros[0][1] = 2 ;
 * numeros[0][2] = 3 ;
 * numeros[0][3] = 4 ;
 *
 * numeros[1][0] = 11 ;
 * numeros[1][1] = 12 ;
 * numeros[1][2] = 13 ;
 * numeros[1][3] = 14 ;
 *
 * Representacion en tabla
 *      0   1   2   3
 * 0    1   2   3   4
 * 1    11  12  13  14
 *
 * -Asignamos elementos indicando el indidce de la fila y columna
 *
 * Ejemplo:
 * Productos[][] productos = new Producto[][];
 *
 * Productos[0][0] = new Producto("mesa");
 * Productos[0][1] = new Producto("tv sony");
 * Productos[1][0] = new Producto("bicicleta");
 * Productos[1][1] = new Producto("laptop");
 *
 * Representacion en tabla
 *
 *        0            1
 * 0    mesa         tv sony
 * 1    bicicleta    laptop
 */

//Obtener elementos
/* Accedemos a los elementos de la matriz mediante indice o llaves de la fila y columna
 *
 * Ejemplo:
 * int num1 = numeros[0][0];
 * int num2 = numeros[0][1];
 * int num3 = numeros[0][2];
 * int num4 = numeros[0][3];
 */

//Declaracion, instanciacion e inicializacion de una matriz
/* Se utiliza cuando conocemos los elementos y el tamañp de la matriz
 *
 * Ejemplo:
 *
 * int[][] numeros = {{1,2,3,4},{11,12,13,14}}
 */

//Recorrer una matriz usando for
/* String[][] nombres = new String[3][2];

 * nombres[0][0] = "Pepe";
 * nombres[0][1] = "Maria";
 *
 * nombres[1][0] = "Pato";
 * nombres[1][1] = "Bea";
 *
 * nombres[2][0] = "Lucas";
 * nombres[2][1] = "Luci";
 *
 * for(int i = 0;i<nombres.length; i++){
 *  for(int j = 0 ; j < nombres.length; j++){
 *      System.out.printl("nombres = nombres[i][j]");
 *  }
 * }
 */
//Recorrer una matriz usando foreach
/* String[][] nombres = new String[3][2];

 * nombres[0][0] = "Pepe";
 * nombres[0][1] = "Maria";
 *
 * nombres[1][0] = "Pato";
 * nombres[1][1] = "Bea";
 *
 * nombres[2][0] = "Lucas";
 * nombres[2][1] = "Luci";
 *
 * for(String[] fila : nombres){
 *  for(String columna :fila){
 *      System.out.printl("nombres = columna");
 *  }
 * }
 */

public class Introduccion {
}
