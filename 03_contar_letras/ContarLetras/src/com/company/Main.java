package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int []  contarLetras(char[] texto, char[] alfabeto) {

        int[] recuento = new int[alfabeto.length];
        for (int i = 0; i < texto.length; i++) {
            for (int j = 0; j < alfabeto.length; j++) {
                if (texto[i] == alfabeto[j]) {
                    recuento[j] += 1;

                }
            }

        } return recuento;
        
        public static void visualizarRecuento(){
        for (int i = 0; i < ; i++) {
            
        }
    
    
    }



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un texto: ");

        String texto = br.readLine().toUpperCase();
        final int alberto = 27;
        char[] alfabetoUsuario = new char[alberto];

       String alfabeto = "ABCDEFGHIJKLMÑOPQRSTUVWXYZ";
        
               
        }

        char[] textoUsuario = texto.toCharArray();
        int[] recuento = contarLetras(alfabeto, textoUsuario);

        for (int i = 0; i < recuento.length ; i++) {
            System.out.print(recuento[i]+" ");
        }
    }


}
