package Auto;

public class EjemploAutomovil {
    public static void main(String[] args) {
        //Creando objeto auto de la clase Subaru
        Automovil sabaru = new Automovil();

        //dandole valores
        sabaru.fabricante = "Subaru";
        sabaru.modelo = "impresa";
        sabaru.cilindrada = 2.0;
        sabaru.color = "blanco";

        //Creando objeto mazda de la clase Automovil;
        Automovil mazda = new Automovil();
        mazda.fabricante = "Mazda";
        mazda.modelo = "BT-50";
        mazda.cilindrada = 3.0;
        mazda.color = "rojo";

        //llamando al metodo
        sabaru.detalle();
        mazda.detalle();
        }

}
