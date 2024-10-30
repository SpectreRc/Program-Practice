package org.example;

import java.util.Scanner;

public class PreExamen {

    public void preexamen1 () {

        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cuántos números quieres introducir?");
        int cantidad = entrada.nextInt();

        int num;
        int mayor = 0;
        int menor = 0;
        int igual = 0;

        for (int i = 0 ; i < cantidad ; i++){

            System.out.println("Introduce un número: ");
            num = entrada.nextInt();

            if (num > 0){
                mayor++;
            }else if (num < 0){
                menor++;
            }else
                igual++;
        }
        System.out.println("Hay " + mayor + " numeros mayores que cero, " + menor + " numeros menores que cero y " + igual + " numeros iguales que cero.");
    }

    public void preexamen2 () {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la base.");
        int base = entrada.nextInt();
        long resultado = 0;

        System.out.println("Introduce el exponente.");
        int exponente = entrada.nextInt();

        while (exponente < 0){
            System.out.println("ERROR. introduce un exponente positivo.");
            exponente = entrada.nextInt();
        }

        for (int i = 0 ; i < exponente ; i++) {
            resultado += base * base;
        }

        if (exponente == 0) {
            System.out.println("El resultado de la potencia es: 1");
        } else if (base < 0) {
            System.out.println("El resultado de la potencia es: " + (resultado * -1));
        } else if (base > 0)
            System.out.println("El resultado de la potencia es: " + resultado);
    }

    public void preexamen3 () {

        Scanner entrada = new Scanner(System.in);
        System.out.println("¿A cuántos meses quieres finaciar tu producto?");
        int meses = entrada.nextInt();
        long euros = 10;
        long total = 0;

        for (int i = 1 ; i <= meses ; i++) {
            total += euros;
            System.out.println("Mes " + i + " = " + euros + "€");
            euros = euros * 2;
        }

        System.out.println("Total a pagar: " + total + "€");

    }

    public void preexamen4 () {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la nota del alumno redondeada (0-10)");
        int nota = entrada.nextInt();

        if (nota == 0 ||nota == 1 || nota == 2 ||nota == 3 || nota == 4){
            nota = 1;
        }else if (nota == 5){
            nota = 2;
        } else if (nota == 6) {
            nota = 3;
        } else if (nota == 7 || nota == 8) {
            nota = 4;
        } else if (nota == 9 || nota == 10) {
            nota = 5;
        }


        switch (nota){

            case 1:
                System.out.println("INSUFICIENTE.");
                break;
            case 2:
                System.out.println("SUFICIENTE.");
                break;
            case 3:
                System.out.println("BIEN.");
                break;
            case 4:
                System.out.println("NOTABLE.");
                break;
            case 5:
                System.out.println("SOBRESALIENTE.");
                break;
            default:
                System.out.println("No válido");
                break;

            // Si el if-else funcionaria asi:
//        case 0:
//        case 1:
//        case 2:
//        case 3:
//        case 4:
//        System.out.println("INSUFICIENTE.");
//        break;
//        case 5:
//        System.out.println("SUFICIENTE.");
//        break;
//        case 6:
//        System.out.println("BIEN.");
//        break;
//        case 7:
//        case 8:
//        System.out.println("NOTABLE.");
//        break;
//        case 9:
//        case 10:
//        System.out.println("SOBRESALIENTE.");
//        break;
//        default:
//        System.out.println("No válido");
//        break;
        }
    }

    public void preexamen5 () {

        Scanner entrada = new Scanner(System.in);

        int sueldo;
        int mayor = 0;
        int maximo = 0;

        for (int i = 1; i <= 5 ; i++) {
            System.out.println("Introduce el " + i + "º salario de NTT Data:");
            sueldo = entrada.nextInt();

            if (sueldo >= 1000){
                mayor++;
            }
            if (sueldo > maximo) {
                maximo = sueldo;
            }
        }

        System.out.println("El sueldo máximo es de: " + maximo + "€");
        System.out.println("Hay " + mayor + " sueldos mayores de 1000€");
    }

    public void preexamen6 () {

        Scanner entrada = new Scanner(System.in);
        int cantidad;
        int mayor_edad = 0;
        int mayor_altura = 0;
        int edad_media = 0;
        int altura_media = 0;

        System.out.println("¿Qué cantidad de alumnos quieres comparar?");
        cantidad = entrada.nextInt();

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Introduce la edad del " + i + "º alumno.");
            int edad = entrada.nextInt();
            System.out.println("Introduce la alura en cm del " + i + "º alumno.");
            int altura = entrada.nextInt();

            if (edad >= 18){
                mayor_edad++;
            }
            if (altura >= 175){
                mayor_altura++;
            }

            edad_media += edad;
            altura_media += altura;

        }

        System.out.println("La edad media es: " + (edad_media/cantidad));
        System.out.println("La altura media en cm es: " + (altura_media/cantidad));
        System.out.println("Hay " + mayor_edad + " alumnos mayores de 18 años.");
        System.out.println("Hay " + mayor_altura + " alumnos por encima de los 175cm.");

    }

    public void preexamen7() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cuántos números quieres imprimir?");

        int num = entrada.nextInt();
        int resultado = 0;
        int num1 = 0;
        int num2 = 1;

        while (num <= 0) {
            System.out.println("ERROR. introcude un número entero positivo.");
            num = entrada.nextInt();
        }

        System.out.print("Secuencia de Números:");

        for (int i = 0; i < num; i++) {
            System.out.print(" " + resultado);
            resultado = num1 + num2;
            num1 = num2;
            num2 = resultado;
        }
    }
}