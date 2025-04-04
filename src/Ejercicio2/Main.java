package Ejercicio2;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------- Numero enteros ---------------");
        List<Integer>listInteger= Arrays.asList(
                1,2,3,4,5,6,7,8,9,10
        );
        Consumer<Integer>integerConsumer=(entero)-> System.out.println(entero);
        integerConsumer.accept(11);
        listInteger.forEach(integerConsumer);
    }
}
