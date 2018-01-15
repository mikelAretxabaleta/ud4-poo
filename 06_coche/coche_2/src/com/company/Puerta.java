package com.company;

public class Puerta {

    private boolean elevalunasElectrico;

    private Coche coche;

    public Puerta(boolean elevalunasElectrico) {
        this.elevalunasElectrico = elevalunasElectrico;
    }

    @Override
    public String toString() {
        return "Puerta{" +
                "elevalunasElectrico=" + elevalunasElectrico +
                ", coche=" + coche +
                '}';
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }
}
