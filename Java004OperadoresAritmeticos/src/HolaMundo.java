//Mi clase en Java

public class HolaMundo {
    
    public static void main(String args[]) {
        //Primera parte
        int a = 3, b = 2;
        var resultado = a + b;
        System.out.println("resultado suma = " + resultado);
        resultado = a - b;
        System.out.println("resultado resta = " + resultado);
        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);
        var resultado2 = 3D / b;
        System.out.println("resultado division = " + resultado2);
        resultado = a % b;
        System.out.println("resultado modulo= " + resultado);
        if (b % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }

        //Segunda Parte
        int c = a + 5 - b;
        System.out.println("c = " + c);
        
        a += 1;//a = a + 1;
        System.out.println("a = " + a);
        a += 3;//a = a + 3;
        System.out.println("a = " + a);
        a -= 2;//a = a - 2;
        System.out.println("a = " + a);
        a *= 1;//a = a * 1;
        System.out.println("a = " + a);
        a /= 1;//a = a / 1;
        System.out.println("a = " + a);
        a %= 1;//a = a % 1;
        System.out.println("a = " + a);

        //Tercera Parte
        //Operadores Unarios
        a = 3;
        b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        var d = true;
        var e = !d;
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        //incremento
        //1.Preincremento (simbolo antes de la variable)
        var f = 3;
        var g = ++f; //primero se incrementa la variable y despues se usa su valor
        System.out.println("f = " + f);
        System.out.println("g = " + g);

        //2.Postincremento (simbolo despues de la variable)
        var h = 5;
        var i = h++; //primero se utiliza el valor de la variables y despues se incrementa
        System.out.println("h = " + h);//teniamos pendiente un incremento
        System.out.println("i = " + i);

        //decremento
        //1.Predecremento (simbolo antes de la variable)
        var j = 2;
        var k = --j; //primero se incrementa la variable y despues se usa su valor
        System.out.println("j = " + j);
        System.out.println("k = " + k);

        //2.Postdecremento (simbolo despues de la variable)
        var l = 4;
        var m = l--; //primero se utiliza el valor de la variables y despues se decrementa
        System.out.println("l = " + l);//teniamos pendiente un decremento
        System.out.println("m = " + m);

        //Cuarta Parte
        a = 3;
        b = 2;
        var c2 = (a == b);
        System.out.println("c2 = " + c2);
        
        var d2 = a != b;
        System.out.println("d2 = " + d2);
        
        var cadena = "Hola";
        var cadena2 = "Adios";
        var e2 = cadena == cadena2; //compara referencias de objetos
        System.out.println("e2 = " + e2);
        
        var f2 = cadena.equals(cadena2);
        System.out.println("f2 = " + f2);

        //Operadores relacionales
        var g2 = a >= b; //mayor que o mayor o igual
        System.out.println("g2 = " + g2);
        
        if (a % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }
        var edad = 30;
        var adulto = 18;
        if (edad >= adulto) {
            System.out.println("Es un adulto");
        } else {
            System.out.println("Es menor de edad");
        }

        //Quinta parte
        //Operadores relacionales
        var a2 = 8;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var resultado3 = a2 >= valorMinimo && a2 <= valorMaximo;
        if (resultado3) {
            System.out.println("Dentro de rango");
        } else {
            System.out.println("Fuera de rango");
        }
        var vacaciones = true;
        var diaDescanso = false;
        if (vacaciones || diaDescanso) {
            System.out.println("Padre puede asistir al juego del hijo");
        } else {
            System.out.println("El padre esta ocupado");
        }

        //Sexta Parte
        //Operadores Ternarios
        var resultado4 = (1 > 2) ? "verdadero" : "falso";
        System.out.println("resultado4 = " + resultado4);
        
        var numero = 8;
        resultado4 = (numero % 2 == 0) ? "numero par" : "numero impar";
        System.out.println("resultado4 = " + resultado4);

        //Septima parte
        //Precedencia de operadores
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        var resultado5 = 4 + 5 * 6 / 3;
        System.out.println("resultado5 = " + resultado5);
        
        resultado5 = (4 + 5) * 6 / 3;
        System.out.println("resultado5 = " + resultado5);
    }
}
