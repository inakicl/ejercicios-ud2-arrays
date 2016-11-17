package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int alumnos = 5;
        String[] personas;
        personas = new String[alumnos];


        for (int i = 0; i < alumnos; i++) {
            System.out.print("Escribe Nombre y apellidos del alumno:  ");
            personas[i] = br.readLine();

        }
        String letra = "ppp";
        do {
            System.out.print("Escribe una letrao fin:  ");

            letra = br.readLine().toLowerCase();
            if (!letra.equalsIgnoreCase("fin")) {
                char letra2 = letra.charAt(0);


                for (int i = 0; i < alumnos; i++) {
                    if (personas[i].toLowerCase().charAt(0) == letra2) {
                        System.out.println(personas[i]);
                    }
                }
            }
        } while (!letra.equalsIgnoreCase("fin"));

    }
}
