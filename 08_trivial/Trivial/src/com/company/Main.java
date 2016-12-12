package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] P = new String[3];
        String[] R = new String[3];

        P[0] = "¿Es la araña un insecto?";
        P[1] = "¿En qué deporte se usa tiza?";
        P[2] = "¿Quién escribió el diario de Ana Frank?";

        R[0] = "No";
        R[1] = "En el billar";
        R[2] = "Ana Frank";

        Random r = new Random();
        int paleatoria = r.nextInt(3);

        //Marcador de respuestas correctas e incorrectas
        int j1p = 0;
        int j1r = 0;
        int j2p = 0;
        int j2r = 0;
        int si = 0;
        int turno = 0;

        //Empieza el juego mostrando una Pregunta aleatoria al usuario
        System.out.println("¡Que comienze el juego!");
        System.out.println("");

        String ter = "";

        do {
            System.out.println("Escribe \"Terminar\" o presiona enter");
            ter = br.readLine();
            if (!ter.equalsIgnoreCase("terminar")) {

                System.out.println(P[paleatoria]);
                System.out.println("¿Quieres ver la respuesta? Presiona enter");
                br.readLine();
                System.out.println("...");
                System.out.println(R[paleatoria]);

                //Calcular la cantidad de respuestas correctas

                System.out.println("¿Acertaste? Escribe \"si o no\"");
                String res = br.readLine();
                if (turno == 0) {
                    if (res.equalsIgnoreCase("si")) {
                        j1p += 1;
                        j1r += 1;
                    } else {
                        j1p += 1;
                    }
                } else {
                    if (res.equalsIgnoreCase("si")) {
                        j2p += 1;
                        j2r += 1;
                    } else {
                        j2p += 1;
                    }

                }

                //Cambiar turno de J1 a J2

                if (turno == 0) {
                    turno = 1;
                } else {
                    turno = 0;
                }
            }
        } while (!ter.equalsIgnoreCase("terminar"));

        System.out.println("Jugador 1 respuestas correctas " + j1r + " de " + j1p);
        System.out.println("Jugador 2 respuestas correctas " + j2r + " de " + j2p);


    }
}
