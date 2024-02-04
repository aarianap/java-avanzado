public class EjemploMatricesStringFor2{
    public static void main(String[] args) {
        String[][] nombres = {{"Pepe","Pepa"},
                {"Jose","Josefa"},
                {"Paco","Pancha"}};

        //para obtener la cantidad filas: nombres.length
        for (int i = 0; i < nombres.length;i++ ){
            //para obtener la cantidad de columnas:
            for (int j = 0; j < nombres[0].length; j++){
                System.out.println(nombres[i][j] + "\t");
            }
            System.out.println();
        }



    }
}