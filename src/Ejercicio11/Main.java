package Ejercicio11;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<LocalDate>localDateSupplier=LocalDate::now;
        Consumer<LocalDate>fecha=a-> System.out.println(a);
        fecha.accept(localDateSupplier.get());
    }
}
