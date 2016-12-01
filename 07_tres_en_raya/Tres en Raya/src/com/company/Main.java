package com.company;

public class Main {

    public static void visualizarTablero(int[][] t) {
        int fila = t.length;
        int columna = t[0].length;

        String tablero[][] = new String[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                tablero[i][j] = ".";

                System.out.format(tablero[i][j]);
            }

            System.out.println();
        }
    }


    public static void comprobarGanador() {

    }

    public static void main(String[] args) {
        int tablero[][] = new int[3][3];

        visualizarTablero(tablero);

    }
}
