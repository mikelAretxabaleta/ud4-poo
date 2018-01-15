package com.company;

public class Motor {

    private int cilindrada;
    private String combustible;
    private int potencia;

    private Coche coche;

    public Motor(int cilindrada, String combustible, int potencia) {
        this.cilindrada = cilindrada;
        this.combustible = combustible;
        this.potencia = potencia;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "cilindrada=" + cilindrada +
                ", combustible='" + combustible + '\'' +
                ", potencia=" + potencia +
                ", coche=" + coche +
                '}';
    }
}
