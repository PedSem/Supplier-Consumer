package EjemploSupplier;

import java.util.Random;
import java.util.function.Supplier;

public class Ejemplo {
    public static void main(String[] args) {
        Supplier<Double>generorandom=()->Math.random();
        Double numero=generorandom.get();
        System.out.println(numero);
        System.out.println(generorandom.get());
        System.out.println("---------------------------");
        Supplier<Integer>generointrandom=()->new Random().nextInt(200+1);
        System.out.println(generointrandom.get());
        System.out.println(generointrandom.get());
        System.out.println("--------------------------------");
        Supplier<Ciudad>city=()->new Ciudad("Elche");
        System.out.println(city.get().getNombre());
    }
}
