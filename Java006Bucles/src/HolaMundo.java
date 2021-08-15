//Mi clase en Java

public class HolaMundo {

    public static void main(String args[]) {
        //Primera parte
        //while
        var contador = 0;
        while (contador < 3) {
            System.out.println("contador = " + contador);
            contador++;
        }

        //Segunda parte
        //do while
        var contador2 = 0;
        do {
            System.out.println("contador2 = " + contador2);
            contador2++;
        } while (contador2 < 3);

        //Tercera parte
        //for
        for (var contador3 = 0; contador3 < 3; contador3++) {
            System.out.println("contador3 = " + contador3);
        }

        //Cuarta parte
        //break y continue
        for (var contador4 = 0; contador4 < 3; contador4++) {
            if (contador4 % 2 == 0) {
                System.out.println("contador4 = " + contador4);
                break;
            }
        }

        for (var contador5 = 0; contador5 < 3; contador5++) {
            if (contador5 % 2 != 0) {
                continue;//ir a la siguiente iteracion
            }
            System.out.println("contador5 = " + contador5);
        }
        
        //Quinta parte
        //Etiquetas
        inicio:
        for (var contador5 = 0; contador5 < 3; contador5++) {
            if (contador5 % 2 != 0) {
                continue inicio;//ir a la linea de codigo de la etiqueta
            }
            System.out.println("contador5 = " + contador5);
        }
    }
}
