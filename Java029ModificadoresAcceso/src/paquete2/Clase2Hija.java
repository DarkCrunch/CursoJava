package paquete2;

import paquete1.Clase2Protected;

public class Clase2Hija extends Clase2Protected{
    
    public Clase2Hija(){
        super();
        this.atributoProtected = "Modificacion atributo protected";
        System.out.println("this.atributoProtected = " + this.atributoProtected);
        this.metodoProtected();
    }
}
