package SumaDeMatrices;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SumaMatrices matrices = new SumaMatrices();


        //pidiendo las filas y columnas para la primera matriz
        System.out.println("Ingrese cuantas filas tendra la primera matriz: ");
        int filas1 = scanner.nextInt();

        System.out.println("Ingrese cuantas columnas tendra la primera matriz: ");
        int columnas1 = scanner.nextInt();

        //creando la matriz
        int[][] matriz1 = new int[filas1][columnas1];

        matriz1 = matrices.PidiendoValores(matriz1);

        int sumaMatirz1;
        sumaMatirz1 = matrices.sumaDeUnaMatriz(matriz1);;

        //pidiendo las filas y columnas para la primera matriz
        System.out.println("Ingrese cuantas filas tendra la segunda matriz: ");
        int filas2 = scanner.nextInt();

        System.out.println("Ingrese cuantas columnas tendra segunda matriz: ");
        int columnas2 = scanner.nextInt();

        //crando la segunda matriz
        int[][] matriz2 = new int[filas2][columnas2];

        matriz2 = matrices.PidiendoValores(matriz2);

        int sumaMatriz2;
        sumaMatriz2 = matrices.sumaDeUnaMatriz(matriz2);

        System.out.println("La suma de tus dos matrices es: \n" + (sumaMatriz2+sumaMatirz1));
    }
}
