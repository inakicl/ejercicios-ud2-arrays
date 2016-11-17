package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int visualizarRecuento(int[] recuento) {

        for (int i = 0; i <; i++) {
            switch (recuento) {

            }
        }


    }


    public static int[] contarLetras(String frase) {

        int[] recuento;
        recuento = new int[27];

        for (int i = 0; i < frase.length(); i++) {
            char delafrase = frase.charAt(0);
            switch (delafrase) {
                case 'a':
                    recuento[0] += 1;
                    break;
                case 'b':
                    recuento[1] += 1;
                    break;
                case 'c':
                    recuento[2] += 1;
                    break;

            }

            delafrase += 1;

        }
        return recuento;
    }


    public static void main(String[] args) throws IOException {

        int[] recuento;
        recuento = new int[27];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduce un texto: ");

        String texto = br.readLine();
        contarLetras(texto);


    }
}
