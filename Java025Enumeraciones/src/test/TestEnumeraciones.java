package test;

import enumeracion.*;

public class TestEnumeraciones {

    public static void main(String[] args) {
        System.out.println("Dia 1: " + Dias.LUNES);
        indicarDiaSemana(Dias.LUNES);
        System.out.println("Continente n°4: " + Continentes.AMERICA);
        System.out.println("Paises del 4to continente: "
                + Continentes.AMERICA.getPaises());
        System.out.println("Habitantes del 4to continente: "
                + Continentes.AMERICA.getHabitantes());
        System.out.println("Continente n°1: " + Continentes.AFRICA);
        System.out.println("Paises del 1er continente: "
                + Continentes.AFRICA.getPaises());
        System.out.println("Habitantes del 1er continente: "
                + Continentes.AFRICA.getHabitantes());
    }

    //Metodo
    private static void indicarDiaSemana(Dias dia) {
        switch (dia) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
        }
    }
}
