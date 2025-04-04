package Ejercicio8;

import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> suma = (x, y) -> System.out.println(x + y);
        BiConsumer<Integer, Integer> resta = (x, y) -> System.out.println(x - y);
        BiConsumer<Integer, Integer> division = (x, y) -> System.out.println(x / y);
        suma.accept(-9,7);
        resta.accept(-9,7);
        division.accept(-9,7);
    }
}
