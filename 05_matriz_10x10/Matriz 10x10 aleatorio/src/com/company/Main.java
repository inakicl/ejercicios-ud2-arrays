package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] matriz = new int[10][10];

       /* Random r = new Random();
        int aleatorio = r.nextInt(100);
*/
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Random r = new Random();
                int aleatorio = r.nextInt(100)-50;
                matriz[i][j] = aleatorio;
            }

        }


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.format("%4d", matriz[i][j]);
            }
            System.out.println();

        }
    }
}
