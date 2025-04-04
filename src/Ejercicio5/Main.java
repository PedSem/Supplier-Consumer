package Ejercicio5;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        Supplier<Double>aleatorio=()->random.nextDouble(6)+1;
        System.out.println("Numero aleatorio 1:" + aleatorio.get());
        System.out.println("Numero aleatorio 2:" + aleatorio.get());
    }
}
