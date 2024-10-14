package org.example;

import java.util.Scanner;

public class practice1u2 {

    public void Prac1(){

        Scanner prac = new Scanner (System.in);

        int dia = 0;
        int mes = 0;
        int anyo = 0;

        // Solicito el día
        while (true) {
            System.out.print("Introduce tu día de nacimiento: ");
            dia = prac.nextInt();
            if (dia > 1 && dia <= 31) {
                break;
            } else {
                System.out.println("Error. Dame un código válido.");
            }
        }

        //Solicito el mes
        while (true) {
            System.out.print("Introduce tu mes de nacimiento: ");
            mes = prac.nextInt();
            if (mes > 1 && mes <= 12) {
                break;
            } else {
                System.out.println("Error. Dame un código válido.");
            }
        }

        //Solicito el año
        while (true) {
            System.out.print("Introduce tu año de nacimiento: ");
            anyo = prac.nextInt();
            if (anyo > 1930 && anyo <= 2024) {
                break;
            } else {
                System.out.println("Error. Dame un código válido");
            }
        }

        // Pido la fecha y hace la suma
        String fecha = "" + dia + mes + anyo;
        int numeroSuerte = 0;

        for (int i = 0; i < fecha.length(); i++) {
            numeroSuerte += Character.getNumericValue(fecha.charAt(i));
        }
        // Me da el número
        System.out.println("Tu número de la suerte es: " + numeroSuerte);

    }

}
