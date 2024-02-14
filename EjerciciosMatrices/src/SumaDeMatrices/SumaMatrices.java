package SumaDeMatrices;

import java.util.Scanner;

//Suma de Matrices:
//Escribe un programa que tome dos matrices como entrada y devuelva la suma de esas dos matrices como resultado.
public class SumaMatrices {
    public static Scanner scanner = new Scanner(System.in);

    public int sumaDeUnaMatriz(int[][] matriz) {
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                suma = suma + matriz[i][j];
            }
        }
        return suma;
    }
    public int[][] PidiendoValores(int[][] matiz){
        for (int i = 0;i < matiz.length;i ++){
            for (int j = 0 ; j<matiz[0].length; j ++){
                System.out.println("Ingrese el valor de la fila: " + (i +1) + " y columna: " + (j + 1));
                matiz[i][j] = scanner.nextInt();
            }
        }

        return matiz;

    }
}
