package Ejercicio14;


import java.time.LocalDate;
import java.util.Date;

public class Programador {
    private String nombre;
    private int salario;
    private LocalDate fechainicio;

    public Programador(String nombre, int salario, LocalDate fechainicio) {
        this.nombre = nombre;
        this.salario = salario;
        if(this.salario==0){
            this.salario=50000;
        }
        this.fechainicio = fechainicio;
        if(this.fechainicio==null){
            this.fechainicio= LocalDate.now();
        }
    }

    public Programador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public LocalDate getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(LocalDate fechainicio) {
        this.fechainicio = fechainicio;
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
