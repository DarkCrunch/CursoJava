package test;

import paquete2.*;
import paquete1.*;

public class TestModificadoresAcceso {

    public static void main(String[] args) {
        Clase1Public objeto1 = new Clase1Public();
        System.out.println("objeto1 = " + objeto1.atributoPublico);
        objeto1.metodoPublico();
        
        Clase2Protected objeto2 = new Clase2Protected("args");
        //System.out.println("objeto1 = " + objeto2.atributoProtected);
        //objeto2.metodoProtected();
        
        Clase2Hija objeto3 = new Clase2Hija();
        System.out.println("objeto3 = " + objeto3);
        
        Clase3Hija objeto4 = new Clase3Hija();
        System.out.println("objeto4 = " + objeto4);
        
        Clase4Hija objeto5 = new Clase4Hija();
        System.out.println("objeto5 = " + objeto5);
    }
}
