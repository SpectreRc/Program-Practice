package org.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Vectores {

    public void vectores() {

        int vector[];

        vector = new int[7];

        vector[2] = 7;
        vector[5] = vector[2] + 4;

        System.out.println(vector[2] + " " + vector[5]);

        for (int i = 0; i < vector.length; i++) {
            System.out.print(" " + vector[i] + " ");
        }

        String palabras[] = new String[3];
        palabras[0] = "Pepe";

        for (int i = 0; i < palabras.length; i++) {
            System.out.print(" " + palabras[i] + " ");
        }
    }

    public void ejer1(){

        Random aleatorio = new Random();

        int numeros[] = new int[8];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = aleatorio.nextInt(501);
            suma += numeros[i];
        }

        System.out.println("La suma de los números es " + suma);

    } //Suma de todos los elementos de un array

    public void ejer2(){

        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[5];

        System.out.println("Introduce los números a invertir...");

        for (int i : numeros){
            numeros[i] = entrada.nextInt();
        }

        for (int i = numeros.length - 1;i >= 0; i--){
            System.out.print(" " + numeros[i] + " ");
        }

    } //Invierte un array

    public void ejer3(){

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int numeros[] = new int[25];

        for (int i : numeros){
            numeros[i] = aleatorio.nextInt(101);
        }

        System.out.println("Introduce un número aleatorio entre 0 y 100...");

        int numerousuario = entrada.nextInt();
        int contador = 0;

        for (int i : numeros){
            if (numerousuario == numeros[i]){
                contador++;
            }
        }

        System.out.println("Tu número aparece " + contador + " veces");
    } //Contar ocurrencias de un número en un array

    public void ejer4(){

        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[5];
        int nuevo[] = new int[4];

        for (int i = 0; i < numeros.length; i++) {
            boolean error = false;
            while (!error) {
                try {
                    System.out.println("Introduce un número: ");
                    numeros[i] = entrada.nextInt();
                    error = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Por favor, introduce un número válido.");
                    entrada.next();
                }
            }
        }

        int posicion = -1;
        boolean posicionValida = false;

        while (!posicionValida) {
            try {
                System.out.println("Introduce una posición (0 a " + (numeros.length - 1) + ") para eliminar el número: ");
                posicion = entrada.nextInt();
                if (posicion >= 0 && posicion < numeros.length) {
                    posicionValida = true;
                } else {
                    System.out.println("Error: Posición fuera de rango. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, introduce un número válido.");
                entrada.next();
            }
        }

        int[] nuevoVector = new int[numeros.length - 1];
        int j = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (i != posicion) {
                nuevoVector[j++] = numeros[i];
            }
        }

        System.out.println("El nuevo vector sin el número en la posición " + posicion + " es:");
        for (int num : nuevoVector) {
            System.out.print(num + " ");
        }
    } // Elimina un elemnto de un array

    public void ejer5(){

        Scanner entrada = new Scanner(System.in);

        int vector[] = new int[5];

        for (int i = 0; i < vector.length; i++) {
            boolean error = false;
            while (!error) {
                try {
                    System.out.println("Introduce un número: ");
                    vector[i] = entrada.nextInt();
                    error = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Por favor, introduce un número válido.");
                    entrada.next();
                }
            }
        }

        System.out.println("El vector es: ");

        for (int i : vector) {
            System.out.print(" " + i + " ");
        }

        System.out.println("");
        System.out.println("El vector rotado es: ");

        for (int i = 0; i < vector.length; i++) {
            System.out.print(" " + vector[(i - 1 + vector.length) % vector.length] + " ");
        }

    } //Rota un array hacia la derecha

    public void ejer6(){

        Scanner entrada = new Scanner(System.in);

        int vector[] = new int[5];
        boolean simetrico = true;
        int izquierda = 0;
        int derecha = vector.length - 1;

        for (int i = 0; i < vector.length; i++) {
            boolean error = false;
            while (!error) {
                try {
                    System.out.println("Introduce un número: ");
                    vector[i] = entrada.nextInt();
                    error = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Por favor, introduce un número válido.");
                    entrada.next();
                }
            }
        }

        while (izquierda < derecha){
            if (vector[izquierda] != vector[derecha]){
                simetrico = false;
                break;
            }
            izquierda++;
            derecha--;
        }

        if (simetrico){
            System.out.println("El vector es simetrico");
        } else {
            System.out.println("El vector no es simetrico");
        }
    } //Comprueba si el array es simétrico (palíndromo)

    public void ejer7(){

        Scanner entrada = new Scanner(System.in);

        int vector1[] = new int[5];
        int vector2[] = new int[5];

        for (int i = 0; i < vector1.length; i++) {
            boolean error = false;
            while (!error) {
                try {
                    System.out.println("Introduce un número: ");
                    vector1[i] = entrada.nextInt();
                    error = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Por favor, introduce un número válido.");
                    entrada.next();
                }
            }
        }

        System.out.println("El vector 1 es: ");

        for (int i = 0; i < vector1.length; i++) {
            System.out.print(" " + vector1[i] + " ");
        }

        System.out.println("");

        for (int i = 0; i < vector2.length; i++) {
            boolean error = false;
            while (!error) {
                try {
                    System.out.println("Introduce un número: ");
                    vector2[i] = entrada.nextInt();
                    error = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Por favor, introduce un número válido.");
                    entrada.next();
                }
            }
        }

        System.out.println("El vector 2 es: ");

        for (int i = 0; i < vector2.length; i++) {
            System.out.print(" " + vector2[i] + " ");
        }

        System.out.println("");

        int vectorCombinado[] = new int[vector1.length + vector2.length];

        for (int i = 0; i < vector1.length; i++) {
            vectorCombinado[i] = vector1[i];
        }

        for (int i = 0; i < vector2.length; i++) {
            vectorCombinado[i + vector1.length] = vector2[i];
        }

        System.out.println("Vector combinado: ");

        for (int i = 0; i < vectorCombinado.length; i++) {
            System.out.print(" " + vectorCombinado[i] + " ");
        }

    } //Combina dos arrays en uno

    public void ejer8(){

        Scanner entrada = new Scanner(System.in);

        int vector1[] = new int[4];

        for (int i = 0; i < vector1.length; i++) {
            boolean error = false;
            while (!error) {
                try {
                    System.out.println("Introduce un número: ");
                    vector1[i] = entrada.nextInt();
                    error = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Por favor, introduce un número válido.");
                    entrada.next();
                }
            }
        }

        System.out.println("El vector 1 es: ");

        for (int i = 0; i < vector1.length; i++) {
            System.out.print(" " + vector1[i] + " ");
        }

        System.out.println("");

        int vector2[] = new int[vector1.length + 1];

        int posicion = -1;
        boolean posicionValida = false;
        while (!posicionValida) {
            try {
                System.out.println("Introduce una posición (0 a " + vector1.length + ") para insertar el nuevo número: ");
                posicion = entrada.nextInt();
                if (posicion >= 0 && posicion <= vector1.length) {
                    posicionValida = true;
                } else {
                    System.out.println("Error: Posición fuera de rango. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, introduce un número válido.");
                entrada.next();
            }
        }

        boolean error = false;
        int nuevoNumero = 0;
        while (!error) {
            try {
                System.out.println("Introduce el nuevo número: ");
                nuevoNumero = entrada.nextInt();
                error = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, introduce un número válido.");
                entrada.next();
            }
        }

        for (int i = 0, j = 0; i < vector2.length; i++) {
            if (i == posicion) {
                vector2[i] = nuevoNumero;
            } else {
                vector2[i] = vector1[j];
                j++;
            }
        }

        System.out.println("El nuevo vector1 es: ");

        for (int i = 0; i < vector2.length; i++) {
            System.out.print(" " + vector2[i] + " ");
        }

    } //Inserta un elemento en un array

    public void ejer9(){

        Scanner entrada = new Scanner(System.in);

        int tamaño = 4;
        String vector[] = new String[tamaño];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Introduce una palabra para la posición " + i + ": ");
            vector[i] = entrada.nextLine();
        }

        String palabraMasLarga = "";
        for (String palabra : vector) {
            if (palabra.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabra;
            }
        }

        System.out.println("La palabra más larga es: " + palabraMasLarga);

    } //Palabra más larga

    public void ejer10(){

        Scanner entrada = new Scanner(System.in);

        String vector[] = new String[4];


    } //Identificar primera letra y contar

    public void samurais(){

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        int samurais[] = new int[7];
        int suma = 0;

        for (int i = 0; i < samurais.length; i++) {
            boolean error = false;
            while (!error) {
                try {
                    System.out.println("Introduce un número: ");
                    samurais[i] = entrada.nextInt();
                    error = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Por favor, introduce un número válido.");
                    entrada.next();
                }
            }
        }

        System.out.println("EQUIPO 1");
        System.out.println("Introduce la potencia de los samuráis: ");

        for (int i = 0; i < samurais.length; i++) {
            System.out.print(" " + samurais[i] + " ");
        }

        System.out.println("");

        int samurais2[] = new int[7];

        for (int i = 0; i < samurais2.length; i++) {
            boolean error = false;
            while (!error) {
                try {
                    System.out.println("Introduce un número: ");
                    samurais2[i] = entrada.nextInt();
                    error = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Por favor, introduce un número válido.");
                    entrada.next();
                }
            }
        }

        System.out.println("EQUIPO 2");
        System.out.println("Introduce la potencia de los samuráis: ");

        for (int i = 0; i < samurais2.length; i++) {
            System.out.print(" " + samurais2[i] + " ");
        }

        System.out.println("");
    }
}
