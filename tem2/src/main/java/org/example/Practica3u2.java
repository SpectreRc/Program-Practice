package org.example;

import java.util.Scanner;

public class Practica3u2 {

    public void prac3() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenido a la comprobante de ISBN de Roberto.");

        int resultado = 0;

        System.out.println("Introduzca el ISBN (10 números): ");
        String isbn = entrada.nextLine();

        if (isbn.length() != 10) {
            System.out.println("El ISBN debe tener exactamente 10 dígitos.");
            return;
        }

        try{
            for (int i = 0; i < 10; i++){
                int digito = Integer.parseInt(String.valueOf(isbn.charAt(i)));
                resultado += digito * (10 - i);
            }

            if(resultado % 11 == 0) {
                System.out.println("El ISBN es válido");
            }else{
                System.out.println("El ISBN no es válido");
            }
        }catch (StringIndexOutOfBoundsException e){

        }
    }
}
