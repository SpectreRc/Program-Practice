package org.example;

import java.util.Scanner;

public class Practica3u2 {

    public void prac3() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el ISBN (10 dígitos):");
        String isbn = entrada.nextLine();

        if (isbn.length() != 10) {
            System.out.println("El ISBN debe tener 10 caracteres.");
            return;
        }

        if (isbn.contains("?")) {
            int suma = 0;
            int Interrogacion = isbn.indexOf('?');

            for (int i = 0; i < 10; i++) {
                if (i == Interrogacion) continue;
                int valor = (isbn.charAt(i) == 'X') ? 10 : Character.getNumericValue(isbn.charAt(i));
                suma += valor * (10 - i);
            }

            int peso = 10 - Interrogacion;
            int digito = (11 - (suma % 11)) % 11;

            if (digito == 10 && Interrogacion == 9) {
                System.out.println("El dígito que falta es: X");
            } else {
                System.out.println("El dígito que falta es: " + digito);
            }

        } else {
            int suma = 0;

            for (int i = 0; i < 9; i++) {
                suma += Character.getNumericValue(isbn.charAt(i)) * (10 - i);
            }

            int ultimoDigito = isbn.charAt(9) == 'X' ? 10 : Character.getNumericValue(isbn.charAt(9));
            suma += ultimoDigito;

            if (suma % 11 == 0) {
                System.out.println("El ISBN es válido.");
            } else {
                System.out.println("El ISBN no es válido.");
            }
        }
    }
}
