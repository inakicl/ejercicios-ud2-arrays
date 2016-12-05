package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void visualizarTablero(int[][] t) {
        int fila = t.length;
        int columna = t[0].length;

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {

                switch (t[i][j]) {
                    case 1:
                        System.out.print(" 0 ");
                        break;
                    case 2:
                        System.out.print(" X ");
                        break;
                    case 0:
                        System.out.print(" . ");
                        break;
                }
            }
            System.out.println();
        }

    }


    public static boolean comprobarGanador(int[][] tabla) {

        int fila = tabla.length;
        int columna = tabla[0].length;


        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {


            }
        }
        //Comprobaciones de ganador o empate.
        //lineas
        if (tabla[0][0] == 1 && tabla[0][1] == 1 && tabla[0][2] == 1) {
            return true;
        }
        if (tabla[0][0] == 2 && tabla[0][1] == 2 && tabla[0][2] == 2) {
            return true;
        }
        if (tabla[1][0] == 1 && tabla[1][1] == 1 && tabla[1][2] == 1) {
            return true;
        }
        if (tabla[1][0] == 2 && tabla[1][1] == 2 && tabla[1][2] == 2) {
            return true;
        }
        if (tabla[2][0] == 1 && tabla[2][1] == 1 && tabla[2][2] == 1) {
            return true;
        }
        if (tabla[2][0] == 2 && tabla[2][1] == 2 && tabla[2][2] == 2) {
            return true;
        }
        //Columnas
        if (tabla[0][0] == 1 && tabla[1][0] == 1 && tabla[2][0] == 1) {
            return true;
        }
        if (tabla[0][0] == 2 && tabla[1][0] == 2 && tabla[2][0] == 2) {
            return true;
        }
        if (tabla[0][1] == 1 && tabla[1][1] == 1 && tabla[2][1] == 1) {
            return true;
        }
        if (tabla[0][1] == 2 && tabla[1][1] == 2 && tabla[2][1] == 2) {
            return true;
        }
        if (tabla[0][2] == 1 && tabla[1][2] == 1 && tabla[2][2] == 1) {
            return true;
        }
        if (tabla[0][2] == 2 && tabla[1][2] == 2 && tabla[2][2] == 2) {
            return true;
        }
        //En X
        if (tabla[0][0] == 1 && tabla[1][1] == 1 && tabla[2][2] == 1) {
            return true;
        }
        if (tabla[0][0] == 2 && tabla[1][1] == 2 && tabla[2][2] == 2) {
            return true;
        }
        if (tabla[0][2] == 1 && tabla[1][1] == 1 && tabla[2][0] == 1) {
            return true;
        }
        if (tabla[0][2] == 2 && tabla[1][1] == 2 && tabla[2][0] == 2) {
            return true;
        }

        return false;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tablero[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = 0;
            }
        }
        final int turnosPosibles = tablero.length * tablero[0].length;
        int fila;
        int columna ;
        int tiradas = 0;

        visualizarTablero(tablero);

        //Que los jugadores metan la casilla donde ponen la ficha, se representan como 0 y 1 depende del jugador 1 o 2.

        for (int i = 0; i < turnosPosibles && !comprobarGanador(tablero); i++) {

            int turno = 0;
            if (i % 2 == 0) {
                turno = 1;
            } else {
                turno = 2;
            }

            System.out.println("Turno de Jugador "+turno+"\n" + "Fila(entre 0 y 2): ");
            fila = Integer.parseInt(br.readLine());
            System.out.println("Columna(entre 0 y 2): ");
            columna = Integer.parseInt(br.readLine());
            if (tablero[fila][columna] == 0) {
                tablero[fila][columna] = turno;
                visualizarTablero(tablero);
                tiradas += 1;
            } else {
                System.err.println("Casilla ocupada...");
                i -= 1;
            }

        }
        if (tiradas < turnosPosibles) {
            System.out.println("Has ganado");
        } else {
            System.out.println("Empate...");
        }
    }
}
