
import java.util.Scanner;

//Mi clase en Java
public class HolaMundo {

    public static void main(String args[]) {
        //Primera parte
        //Sentencia If-Else
        var condicion = true;

        if (condicion) {
            System.out.println("Condicion verdadera");
        } else {
            System.out.println("Condicion falsa");
        }

        var numero = 6;
        var numeroTexto = "Numero desconocido";
        if (numero == 1) {
            numeroTexto = "numero uno";
        } else if (numero == 2) {
            numeroTexto = "numero dos";
        } else if (numero == 3) {
            numeroTexto = "numero tres";
        } else if (numero == 4) {
            numeroTexto = "numero cuatro";
        } else {
            numeroTexto = "numero no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);

        //Segunda Parte
        System.out.println("Ingrese el numero de mes");
        Scanner consola = new Scanner(System.in);
        var mes = Integer.parseInt(consola.nextLine());
        var estacion = "Estacion desconocida";
        if (mes == 12 || mes == 1 || mes == 2) {
            System.out.println("Invierno");
        } else if (mes == 3 || mes == 4 || mes == 5) {
            System.out.println("Primavera");
        } else if (mes == 6 || mes == 7 || mes == 8) {
            System.out.println("Verano");
        } else if (mes == 9 || mes == 10 || mes == 11) {
            System.out.println("Otoño");
        } else {
            System.out.println("estacion = " + estacion);
        }

        //Tercera Parte
        //Condicion Switch
        var numero2 = 2;
        var numeroTexto2 = "";
        switch (numero2) {
            case 1:
                numeroTexto2 = "Numero uno";
                break;
            case 2:
                numeroTexto2 = "Numero dos";
                break;
            case 3:
                numeroTexto2 = "Numero tres";
                break;
            case 4:
                numeroTexto2 = "Numero cuatro";
                break;
            default:
                numeroTexto2 = "Caso no encontrado";
                break;
        }
        System.out.println("numeroTexto2 = " + numeroTexto2);

        //Cuarta parte
        //Ejemplo2
        var numero3 = 1;
        var numeroTexto3 = "";
        switch (numero3) {
            case 12:
            case 1:
            case 2:
                numeroTexto3="Invierno";
                break;
            case 3:
            case 4:
            case 5:
                numeroTexto3="Primavera";
                break;
            case 6:
            case 7:
            case 8:
                numeroTexto3="Verano";
                break;
            case 9:
            case 10:
            case 11:
                numeroTexto3="Otoño";
                break;
            default:
                numeroTexto3="Valor incorrecto";
        }
        System.out.println("numeroTexto3 = " + numeroTexto3);
        //Ejemplo 3
        System.out.println("Ingrese el numero del mes:");
        Scanner consola2 = new Scanner(System.in);
        var numero4 = Integer.parseInt(consola2.nextLine());
        var numeroTexto4 = "";
        switch(numero4){
            case 12: case 1: case 2:
                numeroTexto4="Invierno";
                break;
            case 3: case 4: case 5:
                numeroTexto4="Primavera";
                break;
            case 6: case 7: case 8:
                numeroTexto4="Verano";
                break;
            case 9: case 10: case 11:
                numeroTexto4="Otoño";
                break;
            default:
                numeroTexto4="Valor por defecto";
                break;
        }
        System.out.println("numeroTexto4 = " + numeroTexto4);
    }
}
