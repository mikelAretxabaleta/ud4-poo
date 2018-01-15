package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("COCHE");
        System.out.println("-------------");
        System.out.print("Marca: ");
        String marca = br.readLine();
        System.out.print("Modelo: ");
        String modelo = br.readLine();
        System.out.print("Color: ");
        int color = Integer.parseInt(br.readLine());
        System.out.println();

        Coche coche = new Coche(marca, modelo, color);


        System.out.print("Cuantos motores?: ");
        int num = Integer.parseInt(br.readLine());

        Motor[] motor = new Motor[num];
        for (int i = 0; i < num; i++) {

            System.out.println("MOTOR # "+i);
            System.out.println("----------------");
            System.out.print("Cilindrada: ");
            int cilindrada = Integer.parseInt(br.readLine());
            System.out.print("Combustible: ");
            String combustible = br.readLine();
            System.out.print("Potencia: ");
            int potencia = Integer.parseInt(br.readLine());
            System.out.println();

            motor[i] = new Motor(cilindrada, combustible, potencia);
            motor[i].setCoche(coche);
        }

        System.out.println("RUEDAS");
        System.out.println("----------------");
        System.out.print("Diametro: ");
        String diametro = br.readLine();
        System.out.println();

        Rueda[] rueda = new Rueda[4];
        for (int i = 0; i < 4; i++) {

            rueda[i] = new Rueda(diametro);
            rueda[i].setCoche(coche);
        }
        int numPuertas;
        do {
            System.out.println("Nº de puertas (2 a 5): ");
            numPuertas = Integer.parseInt(br.readLine());
        } while (numPuertas < 2 && numPuertas > 5);
        Puerta[] puerta = new Puerta[numPuertas];
        boolean elevalunasElectrico;
        for (int i = 0; i < numPuertas; i++) {

            System.out.println("PUERTA # "+i);
            System.out.println("-----------------");
            System.out.print("ElevalunasElectrico: ");
            String ee = br.readLine();
            System.out.println();
            if (ee.equalsIgnoreCase("si")) elevalunasElectrico = true;
            else elevalunasElectrico = false;
            puerta[i] = new Puerta(elevalunasElectrico);
            puerta[i].setCoche(coche);
        }

        System.out.println(coche);

        for (int i = 0; i < num; i++) {
            System.out.println(motor[i]);
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(rueda[i]);
        }
        for (int i = 0; i < numPuertas; i++) {
            System.out.println(puerta[i]);
        }
    }
}
