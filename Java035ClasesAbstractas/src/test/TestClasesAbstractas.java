package test;
import domain.*;
public class TestClasesAbstractas {
    public static void main(String[] args) {
        //No se pueden instanciar objetos de las clases abstractas
        //Se usa el upcasting
        FiguraGeometrica figura = new Rectangulo("Cuadrado");
        //Aqui se ejecuta el metodo del polimorfismo(sobreescritura)
        //de la clase hija
        figura.dibujar();
    }
    
}
