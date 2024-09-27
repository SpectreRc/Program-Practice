package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bateria3 {

    public void ejer3() {

        Scanner entrada = new Scanner(System.in);

        float num1 = 0;
        float num2 = 0;
        float resultado = 0;
        int aux = 0;

        while (aux == 0) {
            try {

                System.out.println("Introduce el dividendo...");
                num1 = entrada.nextInt();

                System.out.println("Introduce el divisor...");
                num2 = entrada.nextInt();

                aux = 1;

            } catch (InputMismatchException er) {

                System.out.println("ERROR. Introduce un valor válido...");
                entrada.nextLine();
            }
        }

        if (num2 == 0) {
            System.out.println("ERROR. El divisor no puede ser 0");
        } else {
            resultado = (num1 / num2);
            System.out.println("El resultado es " + resultado);
        }


    }

    public void ejer1() {

        Scanner entrada = new Scanner(System.in);

        int num1 = 0;

        System.out.println("Dame un número...");
        num1 = entrada.nextInt();

        try {
            if (num1 < 0) {
                System.out.println("Éste número es negativo");
            } else {
                System.out.println("Éste número es positivo");
            }

            if (num1 == 0) {
                System.out.println("Éste número es 0 entero");
            }
        } catch (InputMismatchException er) {
            System.out.println("Introduce otro valor");
            entrada.nextLine();
        }
    }

    public void ejer2() {

        Scanner entrada = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        while (num1 == num2) {

            try {
                System.out.println("Introduce un número...");
                num1 = entrada.nextInt();

                System.out.println("Introduce otro número...");
                num2 = entrada.nextInt();

                if (num1 == num2) {
                    System.out.println("ERROR. Los números son iguales.");
                }

                if (num1 > num2) {
                    System.out.println("El número 1 es mayor que el número 2");
                }

                if (num1 < num2) {
                    System.out.println("El número 1 es menor que el número 2");
                }

            } catch (InputMismatchException er) {
                System.out.println("ERROR. Introduce un valor válido...");
                entrada.nextLine();
            }
        }
    }

    public void ejer4(){

        Scanner entrada = new Scanner(System.in);
        
    }
}