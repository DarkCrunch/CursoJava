package domain;

public class Persona {

    private int idPersona;
    private String nombre;
    private static int contadorPersonas;
    
    //Constructor
    public Persona(String nombre){
        this.nombre=nombre;
        
        //Incrementar el contador por cada objeto
        //Recuerda que las variables estaticas de la clase no se referencian
        //con this sino con el mismo nombre de la clase
        Persona.contadorPersonas++;
        
        //Asignar el nuevo valor a la variable idPersona
        this.idPersona=Persona.contadorPersonas;
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public static int getContadorPersonas() {
        return Persona.contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        Persona.contadorPersonas = aContadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + this.idPersona 
                + ", nombre=" + this.nombre + '}';
    }
    
    
}
