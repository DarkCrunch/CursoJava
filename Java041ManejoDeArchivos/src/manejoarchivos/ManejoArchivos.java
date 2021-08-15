package manejoarchivos;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ManejoArchivos {

    public static void crearArchivo(String nombreArchivo) {
        try {
            File archivo = new File(nombreArchivo);
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            JOptionPane.showMessageDialog(null, "Se ha creado el archivo correctamente");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
        }
    }

    public static void escribirArchivo(String nombreArchivo, String contenido) {
        try {
            File archivo = new File(nombreArchivo);
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
            JOptionPane.showMessageDialog(null, "Se ha creado y modificado el archivo correctamente");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
        }
    }

    public static void anexarArchivo(String nombreArchivo, String contenido) {
        try {
            File archivo = new File(nombreArchivo);
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();
            JOptionPane.showMessageDialog(null, "Se ha anexado información archivo correctamente");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
        }
    }

    public static void leerArchivo(String nombreArchivo) {
        try {
            var archivo = new File(nombreArchivo);
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine();
            while (lectura != null) {
                lectura = entrada.readLine();
                System.out.println("lectura = " + lectura);
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
        }
    }
}