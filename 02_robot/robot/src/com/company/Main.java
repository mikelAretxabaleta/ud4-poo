package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Robot robbie = new Robot();

        String rep = new String();
        int x=0;
        int y=0;
        do {
            System.out.print("X: ");
            rep = br.readLine();
            if (!rep.equalsIgnoreCase("fin") && rep.matches("^[0-9]+$")) {
                x = Integer.parseInt(rep);

                System.out.print("Y: ");
                rep = br.readLine();
                if (!rep.equalsIgnoreCase("fin") && rep.matches("^[0-9]+$"))

                    y = Integer.parseInt(rep);

                robbie.mover(x, y);
                System.out.println(robbie);
            }
        }
        while (!rep.equalsIgnoreCase("fin"));
    }

    }
