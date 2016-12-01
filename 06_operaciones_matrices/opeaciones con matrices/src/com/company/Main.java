package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {


    public static int[][] suma(int m1[][], int m2[][]) {

        int[][] r = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                r[i][j] = m1[i][j] + m2[i][j];
            }
        }

        return r;
    }

    public static int[][] escala(int m1[][], int e) {
        int[][] r = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                r[i][j] = e * m1[i][j];


            }

        }


        return r;
    }

    public static int[][] multiplicacion(int m1[][], int m2[][]) {
        //cada fila * cada columna
        int filas = m1.length;
        int columnas = m1[0].length;
//coger el de github que esta bien.
        int[][] r = new int[filas][columnas];
        int t = 0;
        int p = 0;
        int o = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                t += m1[i][j] * m2[j][i];
                r[i][p] = t;
                p++;
                o++;

            }
            p = 0;
            o++;
            t = 0;

        }


        return r;
    }

    public static int[][] traspuesta(int m1[][]) {
        int[][] r = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                r[i][j] = m1[j][i];
            }
        }


        return r;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] matriz = new int[4][4];
        int[][] matriz2 = new int[4][4];

        Random r = new Random(5);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = r.nextInt(10);
                matriz2[i][j] = r.nextInt(10);
            }
        }

        //visualizar las matrices
        System.out.println("Estas son las matrices al inicio");
        visualizar(matriz);
        System.out.println();
        visualizar(matriz2);
        System.out.println();

        //Sumar las dos matrices
        System.out.println("La suma de dos matrices");
        visualizar(suma(matriz, matriz2));
        System.out.println();

        //El producto de la primera por un escalar (se lo pediremos al usuario)
        System.out.println("El producto de la primera por un escalar");
        System.out.print("Escribe un numero a escalar: ");
        int n = Integer.parseInt(br.readLine());

        visualizar(escala(matriz, n));
        System.out.println();


        //El producto de dos matrices
        System.out.println("El producto de dos matrices");
        visualizar(multiplicacion(matriz, matriz2));
        System.out.println();


        //La traspuesta de la segunda matriz
        System.out.println("La traspuesta de la segunda matriz");
        visualizar(traspuesta(matriz2));


    }

    public static void visualizar(int[][] m) {
        for (int f = 0; f < m[0].length; f++) {
            for (int c = 0; c < m[0].length; c++) {
                System.out.format("%4d", m[f][c]);

            }
            System.out.println();
        }
    }
}
