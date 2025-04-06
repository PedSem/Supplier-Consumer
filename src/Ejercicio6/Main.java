package Ejercicio6;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Map<String,String>>crearMapa=()->{
            Map<String,String>mapa=new HashMap<>();
            mapa.put("clave1", "valor1");
            mapa.put("clave2", "valor2");
            mapa.put("clave3", "valor3");
            return mapa;
        };
        Map<String,String>mimapa=crearMapa.get();
        mimapa.forEach((clave,valor)-> System.out.println(clave + "->" + valor));
    }
}
