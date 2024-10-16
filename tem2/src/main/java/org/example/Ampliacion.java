package org.example;

import java.util.Scanner;

public class Ampliacion {

    public void ejer1() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime la altura: ");
        int altura = entrada.nextInt();

        int categoria;

        if (altura <= 150) {
            categoria = 0;
        } else if (altura <= 175) {
            categoria = 1;
        } else {
            categoria = 2;
        }

        switch (categoria) {
            case 0:
                System.out.println("Persona de altura baja.");
                break;
            case 1:
                System.out.println("Persona de altura media.");
                break;
            case 2:
                System.out.println("Persona alta.");
                break;
            default:
                System.out.println("Altura no válida.");
                break;
        }
    }

    public void ejer2(){



    }
}
