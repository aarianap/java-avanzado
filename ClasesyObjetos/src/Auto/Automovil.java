package Auto;

public class Automovil {
    //Atrivutos
    String fabricante;
    String modelo;
    String color;
    double cilindrada;

    //Añadiendo metodos
    //modificador de acceso //que devuelve tambien puede devolver nada //el nombre del metodo //poner el parametro puede estar vacio
    public void detalle(){
        //imprimiendo valores de auto
        //this se refiere a si mismo
        System.out.println("auto.fabricante = " +  this.fabricante);
        System.out.println("auto.modelo = " + this.modelo );
        System.out.println("auto.color = " + this.color);
        System.out.println("auto.cilindrada = " + this.cilindrada);
    }


}
