package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] personas;
        personas = new String[5];


        for (int i = 0; i < 5; i++) {
            System.out.print("Escribe Nombre y apellidos del alumno:  ");
            personas[i] = br.readLine().toUpperCase();

        }
        String letra = "ppp";
        do {
            System.out.print("Escribe una letra:  ");

            letra = br.readLine().toUpperCase();
            if (!letra.equalsIgnoreCase("fin")) {
                char letra2 = letra.charAt(0);


                for (int i = 0; i < 5; i++) {
                    if (personas[i].charAt(0) == letra2) {
                        System.out.println(personas[i]);
                    }
                }
            }
        } while (!letra.equalsIgnoreCase("fin"));

    }
}
