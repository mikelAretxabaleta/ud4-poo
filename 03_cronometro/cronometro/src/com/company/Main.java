package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Cronometro[] c = new Cronometro[10];
        int opcion;
        int i = 0;
        do {
            System.out.println("1. Nuevo cronómetro\n" +
                    "2. Consultar cronómetro\n" +
                    "3. Salir");

            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {

                case 1:
                    c[i] = new Cronometro();
                    System.out.println("Cronometro " + i + " creado");
                    i++;
                    break;
                case 2:
                    if (i > 0 && i<10) {
//                        System.out.println("Nº Cronometro: [0-9]");
//                        int numCron = Integer.parseInt(br.readLine());
                        for (int j = 0; j < i; j++) {


                        System.out.println("Cronometro "+j+"  "+
                                c[j].tiempoTranscurrido());
                    }}
                    break;

            }

        } while (opcion != 3 || i == 11);
    }
}
