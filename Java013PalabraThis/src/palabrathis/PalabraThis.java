package palabrathis;

public class PalabraThis {

    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("\npersona en heap = " + persona
                + "\npersona nombre: " + persona.nombre
                + "\npersona apellido: " + persona.apellido);

    }

}

class Persona {

    String nombre,
            apellido;

    Persona(String nombre, String apellido) {
        //super(); llamada al constructo de la clase padre (Object)
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Persona usando this:"
                + "\nNombre: " + this.nombre
                + "\nApellido: " + this.apellido);
        new Imprimir().imprimir(this);
    }
}

class Imprimir {
    public Imprimir(){
        //el constructor de la clase object(padre) para reservar memoria
        super();
    }
    public void imprimir(Persona persona) {
        System.out.println("\npersona desde la clase imprimir = " + persona);
        System.out.println("impresion del objeto actual(this) " + this);
    }
}
