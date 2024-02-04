public class EjemploMatricesStringFor{
    public static void main(String[] args) {
        String[][] nombres = new String[3][2];
        nombres[0][0] = "Pepe";
        nombres[0][1] = "Pepa";
        nombres[1][0] = "Jose";
        nombres[1][1] = "Josefa";
        nombres[2][0] = "Paco";
        nombres[2][1] = "Pancha";
        //para obtener la cantidad filas: nombres.length
        for (int i = 0; i < nombres.length;i++ ){
            //para obtener la cantidad de columnas:
            for (int j = 0; j < nombres[0].length; j++){
                System.out.println(nombres[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("== Iterando con foreach ==");

        for(String[] fila : nombres ){
            for (String nombre: fila){
                System.out.println(nombre + "\t");
            }
            System.out.println();
        }

    }
}

