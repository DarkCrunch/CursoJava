package test;

import javax.swing.JOptionPane;
import static manejoarchivos.ManejoArchivos.*;

public class TestManejoDeArchivos {

    public static void main(String[] args) {
        var nombreArchivo = JOptionPane.showInputDialog("Ingrese el nombre del archivo:");
        var contenido = JOptionPane.showInputDialog("Ingrese el contenido del archivo");

//        crearArchivo(nombreArchivo);
        escribirArchivo(nombreArchivo, contenido);
        var condicion = JOptionPane.showConfirmDialog(null, "¿Desea agregar informacion?", "Modificando archivo", JOptionPane.YES_NO_OPTION);
        if (condicion == 0) {
            contenido = JOptionPane.showInputDialog("Ingrese el contenido a añadir en el archivo");
            anexarArchivo(nombreArchivo, contenido);

        } else {
            JOptionPane.showMessageDialog(null, "Adios");
        }
        leerArchivo(nombreArchivo);
    }

}
