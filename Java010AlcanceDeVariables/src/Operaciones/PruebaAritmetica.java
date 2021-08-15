package Operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {
        //Variables locales se almacenan en memoria stack
        var a = 10;
        var b = 2;
        miMetodo();
        
        //Variables de tipo Object o llamados tambien instancias
        //de clase se almacenan el la memoria heap
    }

    //para q podamos ejecutarlo en el main es necesario hacerlo static
    public static void miMetodo() {
        System.out.println("otro metodo");
    }

}
