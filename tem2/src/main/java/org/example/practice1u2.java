package org.example;

import java.util.Scanner;

public class practice1u2 {

    public void Prac1() {

        Scanner prac = new Scanner(System.in);

        String fechaNacimiento = "";
        boolean error = false;

        while (!error) {
            System.out.print("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");
            fechaNacimiento = prac.nextLine();

            if (fechaNacimiento.length() != 10 || fechaNacimiento.charAt(2) != '/' || fechaNacimiento.charAt(5) != '/') {
                System.out.println("Error: El formato debe ser dd/mm/aaaa con exactamente dos dígitos para el día, dos para el mes y cuatro para el año.");
                continue;
            }else if(fechaNacimiento == "00/00/0000"){
                System.out.println("Error: La fecha contiene caracteres no válidos.");
                continue;
            }

            int dia = 0;
            int mes = 0;
            int anio = 0;

            try{

                 dia = Integer.parseInt(fechaNacimiento.substring(0, 2));
                 mes = Integer.parseInt(fechaNacimiento.substring(3, 5));
                 anio = Integer.parseInt(fechaNacimiento.substring(6, 10));

                 if (dia <= 0 || mes <= 0 || anio <= 0) {
                     System.out.println("Error: No se permiten valores cero o negativos.");
                 } else if (dia > 31) {
                     System.out.println("Error: El día no puede ser mayor a 31.");
                 } else if (mes > 12) {
                     System.out.println("Error: El mes no puede ser mayor a 12.");
                 } else {
                     error = true;
                 }

                 int sumaDigitos = dia + mes + anio;

                 String sumaDigitosC = Integer.toString(sumaDigitos);
                 int sumaDigitos1 = Integer.parseInt(String.valueOf(sumaDigitosC.charAt(0)));
                 int sumaDigitos2 = Integer.parseInt(String.valueOf(sumaDigitosC.charAt(1)));
                 int sumaDigitos3 = Integer.parseInt(String.valueOf(sumaDigitosC.charAt(2)));
                 int sumaDigitos4 = Integer.parseInt(String.valueOf(sumaDigitosC.charAt(3)));

                 int numsuerte = sumaDigitos1 + sumaDigitos2 + sumaDigitos3 + sumaDigitos4;

                 System.out.println("Tu número de la suerte es: " + numsuerte);

             }catch (Exception e1){
                 System.out.println("Error. La fecha introducida no es válida");             
             }
        }
    }
}
