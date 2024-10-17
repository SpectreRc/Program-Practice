package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica2u2 {

    public void prac2(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora de Roberto.");

        System.out.println("Introduce el primer número: ");
        int num1 = entrada.nextInt();

        System.out.println("Introduce la operación que quieres hacer: (+,-,x,/,R) ");
        String operacion = entrada.next();

        System.out.println("Introduce el segundo número: ");
        int num2 = entrada.nextInt();

        double resultado;

        try{
            switch (operacion){
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "x":
                    resultado = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        resultado = (double) num1 / num2;
                    } else {
                        System.out.println("Error: División entre 0 no permitida.");
                        return;
                    }
                    break;
                case "R":
                    if (num1 >= 0) {
                        resultado = Math.sqrt(num1);
                    } else {
                        System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Operación no válida.");
                    return;
            }
            System.out.println("El resultado de la operación es: " + resultado);

        } catch (InputMismatchException e){
            System.out.println("Error. ");
        }

    }

}
