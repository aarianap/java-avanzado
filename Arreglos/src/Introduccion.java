/* ¿Qué son los arreglos?
 * Son tipos de datos de referencia que contienen varios elementos ordenados, una colección
 * Sus elementos o valores están asociados a una llave o índice y puede contener tipos de referencia o primitivos
 * Pero siempre asociado a un solo tipo de dato
 */
//Declaración e instanciacion
/*La declaracion de un arreglo tiene dos partes:
 * El tipo de datos del arreglo seguido de corchetes
 * y el nombre de la variable
 * Ejemplo: int[] numeros;
 * Un tipo de array incluye el tipo de dato de los elementos que va a contener
 * cuando se crea un array, se utiliza el operador new, mas el tipo de los elementos más el número de elementos
 * EJEMPLO: int[] numeros = new int[3];
 * *Pero, no solo podemos almacenar elementos del tipo primitivos, sino que también del tipo referencial, objetos
 * Ejemplo:
 * Producto[] productos = new Productos[];
 * String[] nombres = new String[];
 */

//Inicializacion de elementos
/* Asignamos elementos mediante la llave índice
 * Ejemplo:
 * int[] numeros = new int[3];
 * numeros[0] = 1;
 * numeros[1] = 2;
 * numeros[2] = 3;
 */

//Obtener elementos
/* Accedemos a los elementos del arreglo mediante la llave o índice
 * Ejemplo:
 * int num1 = numeros[0];
 * int num2 = numeros[1];
 * int num3 = numeros[2];
 */

//Declaración, instanciación e inicializacion de un arreglo
/* Se usa cuando ya conocemos la cantidad de elementos que va a contener
 * Ejemplo:
 * int[] numeros = {1,2,3};
 * Producto[] productos = {new Producto("Mesa comedor"), new Producto("tv 203pulgadas")}
 */

//Recorrer arreglo usando for
/*Ejemplo:
 * String[] nombres = {Andres, Maria, Jose};
 * for(int i  =  0; i < nombres.length ; i++){
 *     System.out.println("nombre = " + nombres[i]);
 * }
 */

//Recorrer arreglo usando for each
/*Ejemplo:
 * String[] nombres = {Andres, Maria, Jose};
 * for(String nom: nombres){
 *     System.out.println("nombre = " + nom);
 * }
 */


public class Introduccion {

}
