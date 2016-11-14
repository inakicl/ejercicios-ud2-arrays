package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int hora = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        /*para definir los numeros totales (24) y no halla que cambiar todos los bucles, se
        definiría una variable para ello.*/
        final int HORAS = 24;  //asi es una constante. Y se cambiaría el 24 de donde los halla a HORAS

        double[] temperaturas;
        temperaturas = new double[24];

        for (int i = 0; i < 24; i++) {

            System.out.print("Escribe la Temperatura de la hora " + hora + ": ");
            temperaturas[i] = Double.parseDouble(br.readLine());
            if (temperaturas[i] > max) {
                max = temperaturas[i];
            }
            if (temperaturas[i] < min) {
                min = temperaturas[i];
            }

            hora = hora + 1;
        }
        //Mostrar el grafico de asteriscos
        for (int i = 0; i < 24; i++) {
            System.out.println("...");
            System.out.print(i);
            System.out.print("  ");

            for (int j = 0; j < temperaturas[j]; j++) {
                System.out.print("*");
            }
            System.out.print("  ");

            System.out.print(temperaturas[i]);

            if (temperaturas[i] == max) {
                System.out.print(" →MAX ");
            }
            if (temperaturas[i] == min) {
                System.out.print(" →MIN ");
            }


        }


        //media y max, min.
        double media1 = 0;
        for (int i = 0; i < 24; i++) {
            media1 += temperaturas[i];


        }
        double media2 = media1 / 24;
        System.out.println("MEdia: " + media2);
        System.out.println("...");


    }
}
