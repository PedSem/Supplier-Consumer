package Ejercicio12;

import java.util.Date;

public class Programador {
    private String nombre;
    private int salario;
    private Date fechainicio;

    public Programador(String nombre, int salario, Date fechainicio) {
        this.nombre = nombre;
        this.salario = salario;
        this.fechainicio = fechainicio;
    }

    public Programador(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", fechainicio=" + fechainicio +
                '}';
    }
}
