package operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {
        //Objetos o instancias de clase
        Aritmetica aritmetica1 = new Aritmetica();
        
        //Asignamiento de valores a atributos del objeto
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado desde la prueba = " + resultado);
        
        resultado=aritmetica1.sumarConArgumentos(5, 8);
        System.out.println("resultado con argumentos = " + resultado);
    }
}
