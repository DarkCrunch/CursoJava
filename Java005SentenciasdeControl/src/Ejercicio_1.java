
import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        //Variables
        Scanner scan = new Scanner(System.in);
        int numero;

        //Consola
        System.out.println("Proporciona un valor entre 0 y 10:");
        numero = scan.nextInt();
        
        //Operaciones
        switch(numero){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("F");
                break;
            case 6:
                System.out.println("D");
                break;
            case 7:
                System.out.println("C");
                break;
            case 8:
                System.out.println("B");
                break;
            case 9:
            case 10:
                System.out.println("A");
                break;
            default:
                System.out.println("Valor desconocido");
                break;
        }
    }

}
