package laboratorio;

public class Caja {

    int ancho,
            alto,
            profundo;

    //Constructor vacio
    public Caja() {

    }
    
    //Constructor con argumentos
    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    //Metodo
    public void CalcularVolumen() {
        int volumen = this.ancho * this.alto * this.profundo;
        System.out.println("El volumen de la caja es: " + volumen);
    }

    //Metodo con argumentos
    public int CalcularVolumenConArgumentos(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
        return this.ancho * this.alto * this.profundo;
    }
    
    //Metodo con retorno
    public int CalcularVolumenConRetorno(){
        return this.ancho * this.alto * this.profundo;
    }

}
