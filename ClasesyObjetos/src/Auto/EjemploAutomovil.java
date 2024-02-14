package Auto;

public class EjemploAutomovil {
    public static void main(String[] args) {
        //Creando objeto auto de la clase Automovil
        Automovil auto = new Automovil();

        //dandole valores
        auto.fabricante = "Subaru";
        auto.modelo = "impresa";
        auto.cilindrada = 2.0;
        auto.color = "blanco";

        //Creando objeto mazda de la clase Automovil;
        Automovil mazda = new Automovil();
        mazda.fabricante = "Mazda";
        mazda.modelo = "BT-50";
        mazda.cilindrada = 3.0;
        mazda.color = "rojo";

        //imprimiendo valores de auto
        System.out.println("auto.fabricante = " +  auto.fabricante);
        System.out.println("auto.modelo = " + auto.modelo );
        System.out.println("auto.color = " + auto.color);
        System.out.println("auto.cilindrada = " +auto.cilindrada);

        //imprimiendo valores de mazda
        System.out.println("mazda.fabricante = " +  mazda.fabricante);
        System.out.println("mazda.modelo = " + mazda.modelo );
        System.out.println("mazda.color = " + mazda.color);
        System.out.println("mazda.cilindrada = " + mazda.cilindrada);

        }

}
