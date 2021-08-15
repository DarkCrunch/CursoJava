package domain;

import java.io.Serializable;
        /*
        Requisito beans:
        *Debe ser una clase con un contructor vacio
        *Sus atributos deben ser privados
        *Encapsulamiento de atributos (getters y setters)
        *Debe tener una interfaz serializable
        */
//Primero se implementa la clase Serializable
public class Persona implements Serializable{
    //Todos los atributos deben ser privados
    private String nombre;
    private String apellido;
    
    //Agregar un contructor vacio
    public Persona(){
        
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //Es necesario el encapsulamiento

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
}
