package com.company;

public class Cronometro {

    // Instante inicial
    private long startTime;
    private long estimatedTime;

    // Cálculo del tiempo transcurrido

    public long tiempoTranscurrido(){

        long estimatedTime=System.nanoTime() - startTime;
        return estimatedTime/1000000000;
    }



    public Cronometro() {

        startTime = System.nanoTime();
    }



}

