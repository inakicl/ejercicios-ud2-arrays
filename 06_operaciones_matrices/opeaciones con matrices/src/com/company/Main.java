package com.company;

import java.util.Random;

public class Main {

    public static int suma(int matriz[], int matriz2[]){

        int r = 0;
        for (int i = 0; i < 4 ; i++) {
            r = matriz[i][i+1] + matriz2[i][i];
        }
        return r;
    }

    public static int escala(){

    }

    public static int multiplicacion(){

    }

    public static int traspuesta(){

    }

    public static void main(String[] args) {

        int[][] matriz = new int[4][4];
        int[][] matriz2 = new int[4][4];


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Random r = new Random();
                int aleatorio = r.nextInt(50);
                matriz[i][j] = aleatorio;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Random r = new Random();
                int aleatorio = r.nextInt(50);
                matriz2[i][j] = aleatorio;
            }
        }
    }
}
