package operaciones;

public class Aritmetica {

    //Atributos de la clase
    int a,
            b;

    //Metodos
    public void sumar() {
        int resultado = this.a + this.b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {
        return this.a + this.b;
    }

    //Metodo con argumento
    public int sumarConArgumentos(int arg1, int arg2) {
        this.a = arg1;
        this.b = arg2;
        return this.a + this.b;
    }
}
