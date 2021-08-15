package test;

import domain.*;

public class TestPolimorfismo {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
        imprimir(empleado);
        
        empleado = new Gerente("Karla", 10000, "Contabilidad");
        imprimir(empleado);
    }
    
    //polimorfismo, recuerda q el polimorfismo funciona siempre y
    //y cuando se haga overriding, en cuanto a los modificadores
    //de acceso los metodos heredados deben ser menos restringidos
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDatos());
    }
}
