package com.cpifppiramide.yolbell.Ejemplo1;

public class User {
    private String nombre;
    private String edad;

    public User(String edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "User{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }
}


