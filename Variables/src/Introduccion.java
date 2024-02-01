/* Que son las variables?
 * *Son lo mas importante de un lenguaje, son las entidades,
 * contienen valores o dato
 * *Una declaracion de variable siempre contiene dos partes,el t
 * el tipo de dato de la variable y su nombre
 *         tipoDato nombreVariable;
 * *El tipo de la variable determina los valores que la varible
 * puede contener y las operaciones que se pueden realizar con ella
 */

//Categorias de tipos
/*-Primitivos:
 * Los primitivos contienen un solo valor e incluyen los tipos como
 * los enteros,flotantes,los carateres,booleanos,etc.
 * Ejemplo:
 * int numero;
 * int numero2 = 20;
 */

 /* -Referenciales:
 * Como tipos de datos referenciados tenemos los arreglo,las clases,
 * y la interfaces.
 * Ejemplo:
 * Usuario usuario = new Usuario("Andres");
 * Integer numero = 10;
 * String nombre= "Andres";
 */
public class Introduccion {
     public static void main(String[] args) {
         String saludar = "Hola mundo desde Java";
         System.out.println(saludar.toUpperCase());

         int numero = 10;

         boolean valor = true;
         int numero2 = 5;
         if (valor){
             System.out.println("numero = " + numero);
             numero2 = 10;
         }
         System.out.println("El numero 2 es= " +numero2 );
         //es flexible
         var numero3 =15;

         String nombre;

         nombre = "Andres";

         if(numero > 10){
             nombre = "juan";
         }
         System.out.println("nombre = " + nombre);
         int edadPersona = 5;
     }
}
