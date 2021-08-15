/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Persona;
import java.util.Scanner;

/**
 *
 * @author farao
 */
public class TestArreglosObject {

    public static void main(String[] args) {
        int tamano;
        Scanner captura = new Scanner(System.in);

        System.out.println("Ingrese el numero de personas:");
        tamano = captura.nextInt();
        Persona personas[] = new Persona[tamano];
        String nombre;
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Ingrese el nombre:");
            nombre = captura.next();
            personas[i] = new Persona(nombre);
        }
        for (int i = 0; i < personas.length; i++) {
            System.out.println("personas ["+i+"] = "+personas[i]);
        }
    }
}
