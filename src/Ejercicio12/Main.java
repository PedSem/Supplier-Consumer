package Ejercicio12;
import java.util.Date;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Programador>programadorSupplier=()->{
          return new Programador("Pedro",1200,new Date());
        };
        System.out.println(programadorSupplier.get());
    }
}
