package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void visualizarTablero(int[][] t, int FilaX, int ColumnaY) {
        int fila = t.length;
        int columna = t[0].length;

        String tablero[][] = new String[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (FilaX == i && ColumnaY == j) {
                    tablero[i][j] = "X";
                } else {
                    tablero[i][j] = ".";
                }
                if (t[i][j] == 1) {
                    tablero[i][j] = "0";
                } else if (t[i][j] == 2) {
                    tablero[i][j] = "1";
                }

                System.out.print("    ");
                System.out.format(tablero[i][j]);
            }

            System.out.println();
            System.out.println();
        }
    }


    public static void comprobarGanador() {

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tablero[][] = new int[3][3];
        final int turnosPosibles = 9;
        int fila = -1;
        int columna = -1;
        visualizarTablero(tablero, fila, columna);

        //Que los jugadores metan la casilla donde ponen la ficha, se representan como 0 y 1 depende del jugador 1 o 2.
        for (int i = 0; i < turnosPosibles; i++) {
            if (i % 2 == 0) {
                System.out.println("Turno de Jugador 1\n" + "Fila(entre 0 y 2): ");
                fila = Integer.parseInt(br.readLine());
                System.out.println("Columna(entre 0 y 2): ");
                columna = Integer.parseInt(br.readLine());
                visualizarTablero(tablero, fila, columna);
                tablero[fila][columna] = 1;
            } else {
                System.out.println("Turno de Jugador 2\n" + "Fila(entre 0 y 2): ");
                fila = Integer.parseInt(br.readLine());
                System.out.println("Columna(entre 0 y 2): ");
                columna = Integer.parseInt(br.readLine());
                visualizarTablero(tablero, fila, columna);
                tablero[fila][columna] = 2;
            }
        }
    }
}
