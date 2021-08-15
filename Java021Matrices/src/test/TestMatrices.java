package test;

import java.util.Scanner;
import domain.Persona;

public class TestMatrices {

    public static void main(String[] args) {
        //objetos
        Scanner scan = new Scanner(System.in);
        //Arreglos
        int edades[][] = new int[3][2];
        String frutas[][] = new String[2][2];
        System.out.println("edades = " + edades);

        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;

        for (int i = 0; i < edades.length; i++) {
            String valor;
            for (int j = 0; j < edades[i].length; j++) {
                valor = String.format("%2s", edades[i][j]);
                System.out.print("\t" + valor + "\t");
            }
            System.out.println("");
        }

        for (int i = 0; i < frutas.length; i++) {
            for (int j = 0; j < frutas[i].length; j++) {
                System.out.println("Ingrese una fruta [" + i
                        + "] - [" + j + "]:");
                frutas[i][j] = scan.next();
            }
        }

        for (int i = 0; i < frutas.length; i++) {
            String valor;
            for (int j = 0; j < frutas[i].length; j++) {
                valor = String.format("%9s", frutas[i][j]);
                System.out.print("\t" + valor + "\t");
            }
            System.out.println("");
        }

        Persona personas[][] = new Persona[2][2];
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");
        imprimir(personas);
    }

    //Funciones
    public static void imprimir(Object matriz[][]) {
        System.out.println("*********************************************");
        for (int i = 0; i < matriz.length; i++) {
            String valor;
            for (int j = 0; j < matriz[i].length; j++) {
                valor = String.format("%7s", matriz[i][j]);
                System.out.print("\t" + valor + "\t");
            }
            System.out.println("");
        }
    }
}
