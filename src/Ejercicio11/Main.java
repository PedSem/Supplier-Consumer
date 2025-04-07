package Ejercicio11;

import java.time.LocalDate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<LocalDate>localDateSupplier=LocalDate::now;
        System.out.println("Hoy estamos a " +localDateSupplier.get());
    }
}
