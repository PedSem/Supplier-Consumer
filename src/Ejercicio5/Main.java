package Ejercicio5;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        Supplier<Double>aleatorio=()->random.nextDouble(6)+1;
        Consumer<Double>imprimiraleatorio=a-> System.out.println(a);
        imprimiraleatorio.accept( aleatorio.get());
        imprimiraleatorio.accept(aleatorio.get());
    }
}
