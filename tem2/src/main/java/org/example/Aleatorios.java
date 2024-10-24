package org.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Aleatorios {

    public void aleatorios() {

        Random aleatorio = new Random();

        int numero = aleatorio.nextInt();
        System.out.println(numero);

        numero = aleatorio.nextInt(7) + 1;
        System.out.println(numero);

        double numero2 = aleatorio.nextDouble();
        System.out.println(numero2);

        double numero3 = Math.random();
        System.out.println(numero3);

    }

    public void ejer1() {

        Random aleatorio = new Random();

        int dado1 = aleatorio.nextInt(6) + 1;
        System.out.println("Dado 1: "+dado1);
        int dado2 = aleatorio.nextInt(6) + 1;
        System.out.println("Dado 1: "+dado1);

    }

    public void ejer2() {

        Random aleatorio = new Random();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        int longitud = aleatorio.nextInt(3) + 6;

        String contrasenya = "";

        int posicion;

        for(int i = 0; i < longitud; i++){

            posicion = aleatorio.nextInt(caracteres.length());
            contrasenya += caracteres.charAt(posicion);

        }

        System.out.println("La contraseña generada es: " + contrasenya);

    }

    public void ejer3(){

        Random aleatorio = new Random();
        Scanner entrada = new Scanner(System.in);

        int minimo = 1;
        int maximo = 0;
        boolean rep = true;

        while(rep){
            try{
                while(minimo > maximo){

                    System.out.println("Introduce un número mínimo: ");
                    minimo = entrada.nextInt();

                    System.out.println("Introduce un número máximo: ");
                    maximo = entrada.nextInt();

                }

                int cantidad = 0;
                System.out.println("¿Cuantos numeros quieres?: ");
                cantidad = entrada.nextInt();

                for(int i = 0; i < cantidad; i++){

                    int numero = aleatorio.nextInt(maximo - minimo + 1) + minimo;
                    System.out.println(numero);
                    rep = false;

                }

            }catch(InputMismatchException e){
                System.out.println("Introduce un valor válido. ");
                entrada.nextLine();
            }
        }

    }
}
