package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Alumno[] alumnos = new Alumno[3];


        for (int i = 0; i < 3; i++) {

            System.out.println("Alumno "+i);
            System.out.print("Nombre: ");
            String nombre = br.readLine();
            System.out.print("Apellidos: ");
            String apellidos = br.readLine();
            System.out.print("DNI: ");
            String dni = br.readLine();
            System.out.print("Telefono: ");
            String telefono = br.readLine();
            System.out.println();

            alumnos[i]=new Alumno(nombre, apellidos, dni, telefono);

        }

        for (int i = 0; i < 3; i++) {

            System.out.println("Alumno "+i+"  "+alumnos[i]);

        }


    }
}
