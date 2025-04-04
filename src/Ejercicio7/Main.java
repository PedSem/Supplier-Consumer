package Ejercicio7;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> integerConsumer=(x,y)-> System.out.println(x*y);
        integerConsumer.accept(-9,7);
    }
}
