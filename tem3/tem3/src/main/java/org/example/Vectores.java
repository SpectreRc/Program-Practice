package org.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Vectores {

    public void vectores() {

        int vector[];

        vector = new int[7];

        vector[2] = 7; //Asigna el valor 7 al elemento en la posición 2 del array vector.
        vector[5] = vector[2] + 4; //Calcula vector[2] + 4 (que es 7 + 4 = 11) y asigna el resultado al elemento en la posición 5 de vector.

        System.out.println(vector[2] + " " + vector[5]);

        for (int i = 0; i < vector.length; i++) {
            System.out.print(" " + vector[i] + " ");
        }

        String palabras[] = new String[3]; //Declara e inicializa un array de cadenas (String) llamado palabras con tamaño 3. Inicialmente, todos sus elementos son null.
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
            numeros[i] = aleatorio.nextInt(501); //Genera un número aleatorio entre 0 y 500 (inclusive) usando aleatorio.nextInt(501) y lo asigna a la posición i de numeros.
            suma += numeros[i]; //Agrega el valor de numeros[i] a suma, acumulando el total de todos los números generados.
        }

        System.out.println("La suma de los números es " + suma);

    } //Suma de todos los elementos de un array

    public void ejer2(){

        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[5];

        System.out.println("Introduce los números a invertir...");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = entrada.nextInt();
        }

        for (int i = numeros.length - 1;i >= 0; i--){ //éste bucle es para invertir los números de dentro del vector
            System.out.print(" " + numeros[i] + " ");
        }

    } //Invierte un array

    public void ejer3(){

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int numeros[] = new int[25];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(101); //Genera un número aleatorio entre 0 y 500 (inclusive) usando aleatorio.nextInt(501) y lo asigna a la posición i de numeros.
        }

        System.out.println("Introduce un número aleatorio entre 0 y 100...");

        int numerousuario = entrada.nextInt();
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numerousuario == numeros[i]) { //Comprueba si el valor en numeros[i] coincide con el valor de numerousuario.
                contador++; //Si es así, incrementa contador en 1, registrando una coincidencia.
            }
        }


        System.out.println("Tu número aparece " + contador + " veces");
    } //Contar ocurrencias de un número en un array

    public void ejer4(){

        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[5];
        int nuevo[] = new int[4];

        for (int i = 0; i < numeros.length; i++) { //Éste bucle para ponerlo en cualquier for que me pidan, para sólo poner números
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

        while (!posicionValida) { // El bucle continúa ejecutándose hasta que posicionValida sea true. Esto asegura que el usuario seguirá ingresando valores hasta proporcionar una posición válida.
            try {
                System.out.println("Introduce una posición (0 a " + (numeros.length - 1) + ") para eliminar el número: ");
                posicion = entrada.nextInt();
                if (posicion >= 0 && posicion < numeros.length) { //Comprueba si la posición ingresada está entre 0 y numeros.length - 1.
                    posicionValida = true; //Si está dentro de este rango, establece posicionValida en true, lo cual termina el bucle.
                } else {
                    System.out.println("Error: Posición fuera de rango. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, introduce un número válido.");
                entrada.next();
            }
        }//Este while es una estructura de control que garantiza que el usuario ingrese correctamente una posición válida dentro del array antes de continuar con la eliminación del número en esa posición.

        int[] nuevoVector = new int[numeros.length - 1];//Crear el nuevo array nuevoVector sin el elemento en la posición indicada
        int j = 0;
        for (int i = 0; i < numeros.length; i++) { //Copia todos los elementos de numeros en nuevoVector, excepto el de la posición que el usuario desea eliminar.
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

        System.out.println("El vector es: "); //Muestra todos los elementos de vector en su orden original, separados por espacios.
        for (int i : vector) {
            System.out.print(" " + i + " ");
        }
        System.out.println("");

        System.out.println("El vector rotado es: "); //Este bucle imprime el array vector rotado una posición hacia la derecha.
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

        while (izquierda < derecha){ //Compara los elementos en posiciones opuestas, moviéndose desde los extremos hacia el centro.
            if (vector[izquierda] != vector[derecha]){ //Si los elementos en las posiciones izquierda y derecha no son iguales, significa que el array no es simétrico.
                simetrico = false;
                break; //Termina el bucle porque ya se ha determinado que el array no es simétrico.
            }
            izquierda++; //Avanza izquierda hacia la derecha y derecha hacia la izquierda, hasta encontrarse en el centro.
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

        int vectorCombinado[] = new int[vector1.length + vector2.length]; //Se crea un nuevo array con un tamaño que es la suma de los tamaños de vector1 y vector2.

        for (int i = 0; i < vector1.length; i++) { //Recorre vector1 y copia cada elemento en vectorCombinado en las posiciones iniciales (de 0 a vector1.length - 1).
            vectorCombinado[i] = vector1[i];
        }

        for (int i = 0; i < vector2.length; i++) { //Recorre vector2 y copia cada elemento en vectorCombinado, pero comenzando desde el índice vector1.length.
            vectorCombinado[i + vector1.length] = vector2[i];
        } //Esto asegura que los elementos de vector2 se ubiquen justo después de los elementos de vector1 en vectorCombinado.

        System.out.println("Vector combinado: ");
        for (int i = 0; i < vectorCombinado.length; i++) { //Recorre y muestra cada elemento de vectorCombinado, imprimiendo el contenido final del array combinado.
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

        int vector2[] = new int[vector1.length + 1]; //vector2 se inicializa con una longitud de vector1.length + 1, ya que necesita espacio adicional para el nuevo número que se va a insertar.

        int posicion = -1;
        boolean posicionValida = false;
        while (!posicionValida) { //Este bucle se asegura de que el usuario introduzca una posición válida para insertar el nuevo número.
            try {
                System.out.println("Introduce una posición (0 a " + vector1.length + ") para insertar el nuevo número: ");
                posicion = entrada.nextInt();
                if (posicion >= 0 && posicion <= vector1.length) { //Si la posición ingresada es válida (dentro del rango 0 a vector1.length), el bucle termina.
                    posicionValida = true;
                } else { //Si la posición está fuera de rango, se le pide al usuario que vuelva a intentar.
                    System.out.println("Error: Posición fuera de rango. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, introduce un número válido.");
                entrada.next();
            }
        } //Solicitar una Posición Válida para la Inserción

        boolean error = false;
        int nuevoNumero = 0;
        while (!error) { //Asegura que el usuario ingrese un número válido. Si se detecta una entrada incorrecta, se muestra un mensaje de error y se solicita nuevamente.
            try {
                System.out.println("Introduce el nuevo número: ");
                nuevoNumero = entrada.nextInt();
                error = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, introduce un número válido.");
                entrada.next();
            }
        } ////Solicitar el Nuevo Número a Insertar

        for (int i = 0, j = 0; i < vector2.length; i++) {
            if (i == posicion) { //Cuando el índice i coincide con la posición seleccionada, nuevoNumero se coloca en vector2[i].
                vector2[i] = nuevoNumero;
            } else { //En las demás posiciones, se copia el valor de vector1[j] en vector2[i]. El índice j avanza solo cuando no se está insertando el nuevo número.
                vector2[i] = vector1[j];
                j++;
            }
        } // Insertar el Nuevo Número en vector2

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
