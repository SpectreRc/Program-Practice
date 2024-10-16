package org.example;

import java.util.Scanner;

public class Cosasstring {

    public void caracteres(){

        //soutv

        String frase = "Me porto mal en clase y no lo reconozco.";

        int tamanyo = frase.length();
        System.out.println("El tamaño de la frase es " + tamanyo);

        char letra = frase.charAt(33);
        System.out.println("La letra en la posición 33 es " + letra);

        String palabra = frase.substring(9,13);
        System.out.println("La palabra con substring es " + palabra);

        String palabra2 = " Parte. ";
        String concatenacion = frase.concat(palabra2);
        System.out.println("La concatenación de la frase con la palabra es " + palabra2 + " es " + concatenacion);

        int posicion = concatenacion.indexOf(palabra2);
        System.out.println("La palabra " + palabra2 + "está en la posicion " + posicion);

        int posicion2 = concatenacion.indexOf("no",8);
        System.out.println("La posición de la palabra 'no' si no tenemos en cuenta las 8 primeras posiciones es " + posicion2);

        int posicion3 = concatenacion.lastIndexOf("no");
        System.out.println("La posición de la última aparición de palabra 'no' es " + posicion3);

        String mayusculas = frase.toUpperCase();
        String minusculas = frase.toLowerCase();
        System.out.println("La frase en mayúsculas es " + mayusculas + " y la frase en minúsculas es " + minusculas);

        String nombre = "Roberto            ";
        nombre = nombre.trim();
        System.out.println("Tu nombre sin espacio es " + nombre);

        String reemplazar = frase.replace("mal","bien");
        System.out.println("La frase con la palabra 'mal' reemplazada por 'bien' queda así " + reemplazar);

        String palabra3 = "hola";
        String palabra4 = "adios";

        if(palabra3.equals(palabra4)==true){
            System.out.println("Las palabras " + palabra3 + " y " + palabra4 + " son iguales.");
        }else{
            System.out.println("Las palabras " + palabra3 + " y " + palabra4 + " son distintas.");
        }

        String palabra5 = "hola";
        String palabra6 = "Hola";

        if(palabra3.equalsIgnoreCase(palabra4)==true){
            System.out.println("Las palabras " + palabra5 + " y " + palabra6 + " son iguales.");
        }else{
            System.out.println("Las palabras " + palabra5 + " y " + palabra6 + " son distintas.");
        }

    }

    public void excepciones(){

        Scanner teclado = new Scanner(System.in);
        boolean error = false;

        System.out.println("Dividendo: ");
        int dividendo = 0;

        if(teclado.hasNextInt()){
            dividendo = teclado.nextInt();
        }else{
            System.out.println("Has introducido un formato incorrecto");
            error = true;
        }

        System.out.println("Divisor: ");
        String divisor = teclado.next();
        int divisor_entero = 0;

        try{
            divisor_entero = Integer.parseInt(divisor);
        }catch(NumberFormatException e1){
            System.out.println("El divisor no es un número. " + e1.getMessage());
        }

        int resultado = 0;

        try {
            resultado = dividendo/divisor_entero;
        }catch(ArithmeticException e2){
            System.out.println("No se puede dividir entre 0" + e2.getMessage());
        }

        System.out.println("Resultado: " + resultado);



    }

}
