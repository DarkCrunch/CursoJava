package laboratorio;

public class PruebaCaja {

    public static void main(String[] args) {
        //Objetos
        Caja caja1 = new Caja();
        Caja caja_argumentada = new Caja(3, 2, 6);

        //Asignacion de valores al objeto de constructor vacio
        caja1.ancho=3;
        caja1.alto=2;
        caja1.profundo=6;
        
        //Valores
        System.out.println("caja1 ancho = "+caja1.ancho);
        System.out.println("caja1 alto = "+caja1.alto);
        System.out.println("caja1 profundo = "+caja1.profundo);
        
        System.out.println("caja_argumentada ancho = "+caja_argumentada.ancho);
        System.out.println("caja_argumentada alto = "+caja_argumentada.alto);
        System.out.println("caja_argumentada profundo = "+caja_argumentada.profundo);
        
        //Referencia en memoria heap
        System.out.println("caja1 = " + caja1);
        System.out.println("caja_argumentada = " + caja_argumentada);
        
        //Ejecucion de metodo
        caja_argumentada.CalcularVolumen();
        caja1.CalcularVolumen();
        
        System.out.println("caja_argumentada volumen = " + caja_argumentada.CalcularVolumenConRetorno());
        System.out.println("caja1 volumen = " + caja1.CalcularVolumenConRetorno());;
    }

}
