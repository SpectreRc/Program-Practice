package org.example;

import java.util.Arrays;
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

    public void ejer1() {

        Random aleatorio = new Random();

        int numeros[] = new int[8];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(501); //Genera un número aleatorio entre 0 y 500 (inclusive) usando aleatorio.nextInt(501) y lo asigna a la posición i de numeros.
            suma += numeros[i]; //Agrega el valor de numeros[i] a suma, acumulando el total de todos los números generados.
        }

        System.out.println("La suma de los números es " + suma);

    } //Suma de todos los elementos de un array

    public void ejer2() {

        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[5];

        System.out.println("Introduce los números a invertir...");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = entrada.nextInt();
        }

        for (int i = numeros.length - 1; i >= 0; i--) { //éste bucle es para invertir los números de dentro del vector
            System.out.print(" " + numeros[i] + " ");
        }

    } //Invierte un array

    public void ejer3() {

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

    public void ejer4() {

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

    public void ejer5() {

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

    public void ejer6() {

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

        while (izquierda < derecha) { //Compara los elementos en posiciones opuestas, moviéndose desde los extremos hacia el centro.
            if (vector[izquierda] != vector[derecha]) { //Si los elementos en las posiciones izquierda y derecha no son iguales, significa que el array no es simétrico.
                simetrico = false;
                break; //Termina el bucle porque ya se ha determinado que el array no es simétrico.
            }
            izquierda++; //Avanza izquierda hacia la derecha y derecha hacia la izquierda, hasta encontrarse en el centro.
            derecha--;
        }

        if (simetrico) {
            System.out.println("El vector es simetrico");
        } else {
            System.out.println("El vector no es simetrico");
        }
    } //Comprueba si el array es simétrico (palíndromo)

    public void ejer7() {

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

    public void ejer8() {

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

    public void ejer9() {

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

    public void ejer10() {

        Scanner entrada = new Scanner(System.in);

        String vector[] = new String[4];


    } //Identificar primera letra y contar

    public void samurais() {

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        int[] equipo1 = new int[7];
        int[] equipo2 = new int[7];

        System.out.println("EQUIPO 1");
        boolean equipo1Correcto = false;
        while (!equipo1Correcto) {
            System.out.print("Introduce la potencia de los samuráis: ");
            int suma = 0;
            boolean error = false;

            for (int i = 0; i < equipo1.length; i++) {
                try {
                    equipo1[i] = entrada.nextInt();
                    if (equipo1[i] < 1 || equipo1[i] > 24) {
                        System.out.println("Error: La potencia debe estar entre 1 y 24.");
                        error = true;
                        break;
                    }
                    suma += equipo1[i];
                } catch (InputMismatchException e) {
                    System.out.println("Error: Por favor, introduce solo números.");
                    entrada.nextLine();
                    error = true;
                    break;
                }
            }
            entrada.nextLine();

            if (!error) {
                if (suma == 30) {
                    equipo1Correcto = true;
                    System.out.println("Equipo 1 completado.");
                } else {
                    System.out.println("ERROR. La potencia total no suma 30. Vuelve a introducir los valores.");
                }
            }
        }

        System.out.println("EQUIPO 2");
        boolean equipo2Correcto = false;
        while (!equipo2Correcto) {
            System.out.print("Introduce la potencia de los samuráis: ");
            int suma = 0;
            boolean error = false;

            for (int i = 0; i < equipo2.length; i++) {
                try {
                    equipo2[i] = entrada.nextInt();
                    if (equipo2[i] < 1 || equipo2[i] > 24) {
                        System.out.println("Error: La potencia debe estar entre 1 y 24.");
                        error = true;
                        break;
                    }
                    suma += equipo2[i];
                } catch (InputMismatchException e) {
                    System.out.println("Error: Por favor, introduce solo números.");
                    entrada.nextLine();
                    error = true;
                    break;
                }
            }
            entrada.nextLine();

            if (!error) {
                if (suma == 30) {
                    equipo2Correcto = true;
                    System.out.println("Equipo 2 completado.");
                } else {
                    System.out.println("ERROR. La potencia total no suma 30. Vuelve a introducir los valores.");
                }
            }
        }

        System.out.println("¡Empieza la batalla!");
        int inicio = aleatorio.nextInt(7);

        int bajasEquipo1 = 0;
        int bajasEquipo2 = 0;

        for (int i = 0; i < equipo1.length; i++) {
            int indice = (inicio + i) % equipo1.length;
            System.out.print("Samurai " + (indice + 1) + ". ");

            if (equipo1[indice] == 0 && equipo2[indice] == 0) {
                System.out.println("Ambos samuráis están muertos.");
            } else if (equipo1[indice] > equipo2[indice]) {
                System.out.println("Gana Equipo 1. " + equipo1[indice] + " vs " + equipo2[indice]);
                equipo2[indice] = 0;
                bajasEquipo2++;
            } else if (equipo1[indice] < equipo2[indice]) {
                System.out.println("Gana Equipo 2. " + equipo1[indice] + " vs " + equipo2[indice]);
                equipo1[indice] = 0;
                bajasEquipo1++;
            } else {
                System.out.println("Empate. Ambos samuráis mueren. " + equipo1[indice] + " vs " + equipo2[indice]);
                equipo1[indice] = 0;
                equipo2[indice] = 0;
                bajasEquipo1++;
                bajasEquipo2++;
            }

            if (bajasEquipo1 > equipo1.length / 2) {
                System.out.println("¡Equipo 2 GANA! Equipo 1 ha tenido " + bajasEquipo1 + " bajas.");
                break;
            } else if (bajasEquipo2 > equipo2.length / 2) {
                System.out.println("¡Equipo 1 GANA! Equipo 2 ha tenido " + bajasEquipo2 + " bajas.");
                break;
            }
        }
    }

    public void navidad() {

        Scanner entrada = new Scanner(System.in);

        final String palabra = "NAVIDAD";

        System.out.println("Introduce la cantidad de letras a mostrar...");
        String cantidad = entrada.nextLine();

        String cantidades[] = cantidad.split(" ");

        String letras[] = palabra.split("");

        System.out.println(Arrays.toString(cantidades));

        System.out.println(Arrays.toString(letras));

        String resultado = "";

        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < Integer.parseInt(cantidades[i]); j++) {
                resultado = resultado + letras[i];
            }
        }

        System.out.println(resultado);
    }

    public void prueba_buscar() {

        String colores[] = {"amarillo","azul","rojo","naranja"};
        String color = "negro";

        boolean existe = Arrays.asList(colores).contains(color);

        if (existe) {
            System.out.println("El color " + color + " existe.");
        } else {
            System.out.println("El color " + color + " no existe.");
        }
    }

    public void ordenar() {

        int numeros[] = {4,3,10,34,21};
        System.out.println(Arrays.toString(numeros));

        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));

        int num = 34;

        int posicion = Arrays.binarySearch(numeros,num);
        System.out.println(posicion);
    } //para ordenar vectores y buscar la posicion de un numero

    public void eliminar() {

        int vector[] = {1,1,6,7,8,8,10,15,15};

        System.out.println(Arrays.toString(vector));

        int aux[] = new int[vector.length];

        int vector2[];

        for (int i = 0; i < vector.length; i++) {
            if (i != vector.length - 1 && vector[i] == vector[i + 1]) {
                System.out.println("Duplicado: " + vector[i]);
            }else{
                aux[i] = vector[i];
            }
        }

        System.out.println(Arrays.toString(aux));
    } //eliminar duplicados de un vector

    public void locowin() {

        Scanner entrada = new Scanner(System.in);

        Random aleatorio = new Random();

        String colores[] = {"rojo","negro"};

        Integer numeros[] = new Integer[37];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
        }

        String pares[] = {"par","impar"};

        System.out.println("Dime un número (0-36): ");
        int numero = entrada.nextInt();

        boolean numero_existe = Arrays.asList(numeros).contains(numero);
        String color = "";
        String par_impar = "";

        if (!numero_existe) {
            System.out.println("ERROR. El número no es válido.");
            return;
        }else{
            if (numero != 0){
                System.out.println("Dime un color (rojo - negro). ");
                color = entrada.next();
                boolean color_existe = Arrays.asList(colores).contains(color);
                if (!color_existe) {
                    System.out.println("ERROR. El color no es válido.");
                    return;
                }else{
                    System.out.println("Es par o impar? ");
                    par_impar = entrada.next();
                    boolean par_impar_existe = Arrays.asList(pares).contains(par_impar);
                    if (!par_impar_existe) {
                        System.out.println("ERROR. La opción no es válida.");
                        return;
                    }
                }
            }
        }

        int numero_sorteo = numeros[aleatorio.nextInt(37)];

        String color_sorteo = colores[aleatorio.nextInt(2)];

        String par_impar_sorteo = "";

        if (numero_sorteo % 2 == 0){
            par_impar_sorteo = "par";
        }else{
            par_impar_sorteo = "impar";
        }

        //falta dar premios
    }
}

