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

    //podria hacerse un array de 2 dimensiones [][]
    public static int[] contarLetras(String frase) {
        final int alfabeto = 27;
        int[] recuento;
        recuento = new int[alfabeto];

        for (int i = 0; i < frase.length(); i++) {
            char delafrase = frase.charAt(i);
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

        final int alfabeto = 27;
        int[] recuento;
        recuento = new int[alfabeto];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduce un texto: ");

        String texto = br.readLine();
        contarLetras(texto);


    }
}
