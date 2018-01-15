package com.company;

public class Rueda {

    private String diametro;

    private Coche coche;

    public Rueda(String diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Rueda{" +
                "diametro='" + diametro + '\'' +
                ", coche=" + coche +
                '}';
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }
}
