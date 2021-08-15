package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

public class TestHerencia {

    public static void main(String[] args) {
        //objetos
        var fecha = new Date();
        Empleado empleado1 = new Empleado("Juan", 5000.0);
        Cliente cliente1 = new Cliente("Karla", 28, 'F', "Saturno 15", fecha, true);

        System.out.println("empleado1 = " + empleado1);
        System.out.println("cliente1 = " + cliente1);
    }
}
