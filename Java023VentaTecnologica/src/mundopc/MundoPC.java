package mundopc;

import mx.com.gm.mundopc.*;

public class MundoPC {

    public static void main(String[] args) {
        Monitor monitor1 = new Monitor("LG", 24);
        Teclado teclado1 = new Teclado("Bluetooth", "Genius");
        Raton raton1 = new Raton("Bluetooth", "Teraware");
        Computadora computadora1 = new Computadora("Gambyte", monitor1, teclado1, raton1);
        
        Monitor monitor2 = new Monitor("HP", 14);
        Teclado teclado2 = new Teclado("Bluetooth", "GeniusF");
        Raton raton2 = new Raton("Bluetooth", "TerawareF");
        Computadora computadora2 = new Computadora("Lenovo", monitor2, teclado2, raton2);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora2);
        
        orden1.mostrarOrden();
        
    }
}
