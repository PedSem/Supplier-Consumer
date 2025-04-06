package Ejercicio12y13;
import javax.lang.model.type.PrimitiveType;
import java.util.Date;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //12.
        Supplier<Programador>programadorSupplier=()->{
          return new Programador("Pedro",1200,new Date());
        };
        System.out.println(programadorSupplier.get());
        Supplier<Programador>programadorSupplier1=()->{
            return new Programador("Pedro");
        };
        System.out.println(programadorSupplier1.get());
    }
}
