package org.example;

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

    }

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

    }

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
    }
}
