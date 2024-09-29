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

    public void ejer4() {

        Scanner entrada = new Scanner(System.in);

        float numb = 0;
        float numh = 0;
        float resultado = 0;

        try {
            System.out.println("Introduce un valor base mayor que 0...");
            numb = entrada.nextFloat();

            while (numb <= 0) {
                System.out.println("ERROR. El valor de la base debe ser mayor que 0.");
                System.out.println("Introduce un valor base mayor que 0...");
                numb = entrada.nextFloat();
            }

            System.out.println("Introduce un valor altura mayor que 0...");
            numh = entrada.nextFloat();

            while (numh <= 0) {
                System.out.println("ERROR. El valor de la altura debe ser mayor que 0.");
                System.out.println("Introduce un valor altura mayor que 0...");
                numh = entrada.nextFloat();
            }

            resultado = (numb * numh) / 2;
            System.out.println("El área del triángulo es " + resultado);

        } catch (InputMismatchException er) {
            System.out.println("ERROR. Introduce un valor válido...");
            entrada.nextLine();
        }
    }

    public void ejer5() {

        Scanner entrada = new Scanner(System.in);

        float num1 = 0;
        float num2 = 0;
        float num3 = 0;
        float minimo;

        System.out.println("Introduce el primer número:");
        num1 = entrada.nextFloat();

        System.out.println("Introduce el segundo número:");
        num2 = entrada.nextFloat();

        System.out.println("Introduce el tercer número:");
        num3 = entrada.nextFloat();

        if (num1 < num2 && num1 < num3) {
            minimo = num1;
        } else if (num2 < num1 && num2 < num3) {
            minimo = num2;
        } else {
            minimo = num3;
        }

        System.out.println("El número mínimo es: " + minimo);

    }

    public void ejer6() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Tienes tomate? (sí/no):");
        String tomate = entrada.nextLine().toLowerCase();

        System.out.println("¿Tienes aceite? (sí/no):");
        String aceite = entrada.nextLine().toLowerCase();

        System.out.println("¿Tienes jamón? (sí/no):");
        String jamon = entrada.nextLine().toLowerCase();

        if (tomate.equals("no") || aceite.equals("no") || jamon.equals("no")) {
            System.out.println("¡Tenemos que ir a comprar!");
        } else {
            System.out.println("¡No tenemos que ir a comprar!");
        }
    }

    public void practica3() {

        Scanner entrada = new Scanner(System.in);

        int edad = 0;
        int años = 0;

        System.out.println("Introduce tu nombre...");
        String nombre = entrada.nextLine();

        System.out.println("Hola " + nombre + "Introduce tu edad...");
        edad = entrada.nextInt();

        if (edad >= 18) {
            System.out.println("Enhorabuena " + nombre + ", puedes votar...");
        } else {
            años = 18 - edad;
            System.out.println("Lo siento " + nombre + ", no puedes votar");
            System.out.println("Te faltan " + años + " años para ser mayor de edad");
        }
    }
}

