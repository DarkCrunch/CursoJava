package domain;

public class Persona {

    //Atributos
    private int idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private int telefono;

    //Constructores
    public Persona() {
    }

    public Persona(int idPersona) {
        this.setIdPersona(idPersona);
    }

    public Persona(String nombre, String apellido, String email, int telefono) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setEmail(email);
        this.setTelefono(telefono);
    }

    public Persona(int idPersona, String nombre, String apellido, String email, int telefono) {
        this.setIdPersona(idPersona);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setEmail(email);
        this.setTelefono(telefono);
    }

    //Encapsulamiento
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

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    //Metodos
    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + this.getIdPersona() 
                + ", nombre=" + this.getNombre() 
                + ", apellido=" + this.getApellido() 
                + ", email=" + this.getEmail()
                + ", telefono=" + this.getTelefono() + '}';
    }
    
}
