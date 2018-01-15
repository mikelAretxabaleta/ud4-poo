package com.company;

public class Alumno {

    private String nombre;
    private String apellidos;
    private String dni;
    private String telefono;

    private Grupo grupo;

    public Alumno(String nombre, String apellidos, String dni, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;

    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", telefono='" + telefono + '\'' +
                ", grupo=" + grupo +
                '}';
    }
}
