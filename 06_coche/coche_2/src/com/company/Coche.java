package com.company;

public class Coche {

    private String marca;
    private String modelo;
    private int color;

    public Coche(String marca, String modelo, int color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color=" + color +
                '}';
    }
}
