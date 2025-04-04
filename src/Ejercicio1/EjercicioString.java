package Ejercicio1;

import java.util.function.Consumer;

public class EjercicioString {
    public static void main(String[] args) {
        Consumer<String>stringConsumer=(nombre)-> System.out.println(nombre);
        stringConsumer.accept("Estoy en clase de programacion");
    }
}
