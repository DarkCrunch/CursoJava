package constructores;

public class Aritmetica {

    //Atributos de la clase
    int a,
            b;

    //Constructor vacio, son metodos especiales q se
    //llaman igual que la clase
    public Aritmetica() {
        System.out.println("Ejecutando constructor");
    }

    //La sobrecarga de constructores es cuando hay dos a mas en una clase
    public Aritmetica(int arg1, int arg2) {
        this.a = arg1;
        this.b = arg2;
        System.out.println("Ejecutando constructor con argumentos");
    }
}
