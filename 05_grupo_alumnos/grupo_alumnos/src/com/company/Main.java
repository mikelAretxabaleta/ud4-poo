package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Grupo grupo = new Grupo();


        for (int i = 0; i < 3; i++) {

            System.out.println("Alumno " + i);
            System.out.print("Nombre: ");
            String nombre = br.readLine();
            System.out.print("Apellidos: ");
            String apellidos = br.readLine();
            System.out.print("DNI: ");
            String dni = br.readLine();
            System.out.print("Telefono: ");
            String telefono = br.readLine();
            System.out.println();

            grupo.alumnos[i] = new Alumno(nombre, apellidos, dni, telefono);
            grupo.alumnos[i].setGrupo(grupo);
        }

        for (int i = 0; i < 3; i++) {

            System.out.println("Alumno " + i + "  " + grupo.alumnos[i]);

        }


    }


}