package org.example;

import java.util.Random;
import java.util.Scanner;

public class Examen_ud2_roberto {

    public void examen2(){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroObjetivo = random.nextInt(100) + 1;
        int intentosRestantes = 10;
        boolean adivinado = false;

        System.out.println("Adivina un número entre 1 y 100! Tienes 10 intentos: ");

        while (intentosRestantes > 0 && !adivinado) {
            System.out.print("Ingresa tu intento: ");
            int intento = scanner.nextInt();

            if (intento == numeroObjetivo) {
                System.out.println("¡Correcto! Has adivinado el número.");
                adivinado = true;
            } else if (intento < numeroObjetivo) {
                System.out.println("El número es mayor");
            }else if (intento > numeroObjetivo)
                System.out.println("El número es menor");
            intentosRestantes--;

            if (intentosRestantes <= 0 && !adivinado) {
                System.out.println("Te quedan " + intentosRestantes + "intentos");
            }
        }



    }

}
