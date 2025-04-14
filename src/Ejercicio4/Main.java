package Ejercicio4;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Supplier<String> stringSupplier=()->{
          return "java es una clase de programacion";
        };
        Consumer<String>consumer=a-> System.out.println(a);
        consumer.accept(stringSupplier.get());
    }
}
