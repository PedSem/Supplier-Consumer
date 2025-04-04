package Ejercicio4;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Supplier<String> stringSupplier=()->{
          return "java es una clase de programacion";
        };
        System.out.println(stringSupplier.get());
    }
}
