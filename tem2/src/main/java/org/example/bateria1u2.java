package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bateria1u2 {

    public void ejer1(){

        String frase = "Prueba ejercicio caracteres";
        System.out.println("Prueba ejercicio caracteres");

        int tamanyo = frase.length();
        System.out.println("El tamaño de la frase es " + tamanyo);

        frase = frase.trim();
        System.out.println("La frase sin espacio es " + frase);

        String mitad1 = frase.substring(0,13);
        String mitad2 = frase.substring(13,27);
        System.out.println("El texto dividido en dos mitades es " + mitad1 + " y " + mitad2);

        String mayusculas = frase.toUpperCase();
        System.out.println("La frase en mayúsculas es " + mayusculas);

    }

    public void ejer2(){

        String frase = "Prueba ejercicios caracteres";

        String palabra1 = "Prueba";
        String palabra2 = "ejercicios";

        if (palabra1.length() > palabra2.length()){
            System.out.println("La palabra " + palabra1 + " es mayor que la palabra " + palabra2);
        }else{
            System.out.println("La palabra " + palabra2 + " es mayor que la palabra " + palabra1);
        }

    }

    public void ejer3(){

        Scanner teclado = new Scanner(System.in);
        boolean err = true;
        int n = 0;
        int m = 0;

        while (err) {
            try{
                System.out.println("Introduce un número...");
                n = teclado.nextInt();

                System.out.println("Introduce otro número para quitar las cifras al anterior...");
                m = teclado.nextInt();
                if (n>m){
                    err=false;
                }else{
                    System.out.println("No se pueden quitar más cifras");
                }
            }catch (InputMismatchException e){
                System.out.println("El formato no es correcto...");
                teclado.nextLine();
        }

        String n_string = Integer.toString(n);
        int tamanyo = n_string.length();

        n_string = n_string.substring(0,n_string.length()-m);

        System.out.println("El número sin las " + m + " cifras es " + n_string);

    }





    }

    public void ejer4(){

        Scanner teclado = new Scanner (System.in);

        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine();
        frase = " " + frase + " ";
        //frase = frase.replace(",", " ");
        //frase = frase.replaceAll();
        frase = frase.toLowerCase();

        System.out.println("Introduce una subcadena: ");
        String subcadena = teclado.nextLine();
        subcadena = " " + subcadena + " ";

        int fraselength = frase.length();
        int frasesinsubcadena = frase.replace(subcadena, "").length();

        int division = (fraselength - frasesinsubcadena) / subcadena.length();
        System.out.println(division);

    }

    public void ejer5(){



    }
}

