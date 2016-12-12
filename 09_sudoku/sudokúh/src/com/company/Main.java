package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] tablero = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                tablero[i][j] = 0;

            }
        }

        tablero[0][0] = 5;
        tablero[0][1] = 3;
        tablero[0][4] = 7;
        tablero[1][0] = 6;
        tablero[1][3] = 1;
        tablero[1][4] = 9;
        tablero[1][5] = 5;
        tablero[2][1] = 9;
        tablero[2][2] = 8;
        tablero[2][7] = 6;
        tablero[3][0] = 8;
        tablero[3][4] = 6;
        tablero[3][8] = 3;
        tablero[4][0] = 4;
        tablero[4][3] = 8;
        tablero[4][5] = 3;
        tablero[4][8] = 1;
        tablero[5][0] = 7;
        tablero[5][4] = 2;
        tablero[5][8] = 6;
        tablero[6][1] = 6;
        tablero[6][6] = 2;
        tablero[6][7] = 8;
        tablero[7][3] = 4;
        tablero[7][4] = 1;
        tablero[7][5] = 9;
        tablero[7][8] = 5;
        tablero[8][4] = 8;
        tablero[8][7] = 7;
        tablero[8][8] = 9;


        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {
                if (tablero[i][j] == 0) {
                    System.out.print("   .");
                } else {
                    System.out.format("%4d", tablero[i][j]);
                }

            }
            System.out.println();
        }
        int fila;
        int columna;

        do {
            System.out.print("Escribe la fila (0-8): ");
            fila = Integer.parseInt(br.readLine());
            System.out.println("Escribe la columna (0-8): ");
            columna = Integer.parseInt(br.readLine());
            if (tablero[fila][columna] != 0) {
                System.err.println("Casilla ocupada");
            }
        } while (tablero[fila][columna] != 0);

        int err = 0;
        int n = -1;
        do {
            System.out.print("Mete el num: ");
             n = Integer.parseInt(br.readLine());


            for (int j = 0; j < 9; j++) {
                if (tablero[fila][j] == n) {
                    System.err.println("Nº repetido en la linea");
                } else {

                    err = 1;
                }
                if (tablero[j][columna] == n) {

                    System.err.println("Nº repetido en columna");
                } else {

                    err = 1;
                }

            }

        } while (err != 1);

        //comprobar cuadrante de 3x3 (en el que solo hay del 1-9 sin repeticiones)
        int in = -1;
        int ln = -1;
        if (fila < 3 && columna < 3) {
            in = 0;
            ln = 3;
        }
        if (fila >= 3 && fila < 6 && columna >= 3 && columna < 6) {
            in = 3;
            ln = 6;
        }
        if (fila >= 6 && fila < 9 && columna >= 6 && columna < 9)

            //faltan ifs

            for (int i = in; i < ln; i++) {
                for (int j = in; j < ln; j++) {
                    if (tablero[i][j] == n){
                        System.err.println("Cuadrante con el mismo número");

                    }

                }

            }

    }
}
