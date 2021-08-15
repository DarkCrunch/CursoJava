package test;
import domain.*;
public class TestOverriding {
    public static void main(String[] args) {
        Gerente g = new Gerente("Juan", 5000, "Sistemas");
        System.out.println("g = " + g.obtenerDetalles());
    }
}
