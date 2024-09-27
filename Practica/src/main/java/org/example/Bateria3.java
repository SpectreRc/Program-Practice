package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bateria3 {

    public void ejer3(){

        Scanner entrada = new Scanner(System.in);

        float num1 = 0;
        float num2 = 0;
        float resultado = 0;
        int aux = 0;

        while (aux==0){
            try{

                System.out.println("Introduce el dividendo...");
                num1 = entrada.nextInt();

                System.out.println("Introduce el divisor...");
                num2 = entrada.nextInt();

                aux= 1;

            }catch (InputMismatchException er) {

                System.out.println("ERROR. Introduce un valor válido...");
                entrada.nextLine();
            }
        }

        if (num2==0){
            System.out.println("ERROR. El divisor no puede ser 0");
        }else{
            resultado = (num1/num2);
            System.out.println("El resultado es " + resultado);
        }



    }


}
