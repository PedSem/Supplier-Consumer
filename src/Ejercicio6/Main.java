package Ejercicio6;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Map<String,String>mapa=new HashMap<>();
        mapa.put("1","2");
        Supplier<String>crearMapa=()->{
            return mapa.get("1");
        };
        System.out.println(crearMapa.get());
    }
}
