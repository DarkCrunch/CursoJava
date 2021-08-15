package test;

import java.util.Scanner;

public class TestArreglos {

    public static void main(String[] args) {
        int tamano;
        Scanner capturar = new Scanner(System.in);
        System.out.println("Proporcione el numero de personas: ");
        tamano = capturar.nextInt();
        int edad[] = new int[tamano];
        for (int i = 0; i < edad.length; i++) {
            System.out.println("Ingrese la edad: ");
            edad[i] = capturar.nextInt();
        }
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad[" + i + "] = " + edad[i]);
        }
    }
}
