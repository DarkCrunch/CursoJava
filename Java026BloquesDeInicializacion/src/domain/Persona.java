package domain;

public class Persona {

    /*Existen dos tipos de incializacion los estaticos y los no
    estaticos, recordar q los bloques se ejecutan antes del 
    constructor*/
    //Atributos
    private final int idPersona;
    private static int contadorPersonas;

    //bloques de inicializacion estaticos
    static { // no podemos usar this en este bloque
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
    }

    //bloques de inicializacion no estaticos
    {//si podemos usar this
        System.out.println("Ejecucion bloque no estatico");
        this.idPersona = Persona.contadorPersonas++;
    }
    
    //Constructores
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    //Encapsulamiento
    public int getIdPersona() {
        return idPersona;
    }
}
