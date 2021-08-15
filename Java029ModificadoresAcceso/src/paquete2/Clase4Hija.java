package paquete2;

import paquete1.*;

public class Clase4Hija extends Clase4Private {

    public Clase4Hija() {
        super("args");
        System.out.println("this.getAtributoPrivado = " 
                + this.getAtributoPrivado());
    }
}
