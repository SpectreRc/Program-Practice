package org.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Primitiva {

    public  void primitiva() {

        Scanner entrada = new Scanner(System.in);

        Random random = new Random();

        int numtuyo[] = new int[6];
        int numganador[] = new int[6];
        int aciertos = 0;

        for (int i = 0; i < numtuyo.length; i++) { //Con éste for me aseguro de sólo introducir números entre el 1 y el 49.
            boolean error = false;
            while (!error) {
                try {
                    System.out.println("Introduce un número entre 1 y 49: ");
                    numtuyo[i] = entrada.nextInt();
                    if (numtuyo[i] < 1 || numtuyo[i] > 49) {
                        System.out.println("Error: El número debe estar entre 1 y 49.");
                    } else {
                        error = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Por favor, introduce un número válido.");
                    entrada.next();
                }
            }
        }

        for (int i = 0; i < numganador.length; i++) { // Aquí te da el número ganador randomizado.
            numganador[i] = random.nextInt(49) + 1;
        }

        System.out.print("Números del usuario: "); // Te muestra tu número
        for (int num : numtuyo) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Números ganadores: "); // Te muestra el número ganador
        for (int num : numganador) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 0; i < numtuyo.length; i++) { // Te hace la comparativa entre tu número y el ganador a ver cuantos son iguales
            for (int j = 0; j < numganador.length; j++) {
                if (numtuyo[i] == numganador[j]) {
                    aciertos++;
                    break;
                }
            }
        }

        System.out.println("Has acertado " + aciertos + " números."); // Te muestra en pantalla cuantos números has acertado
        entrada.close();
    }
}
