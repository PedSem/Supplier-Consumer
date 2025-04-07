package Ejercicio10;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String>integerStringMap=new LinkedHashMap<>();
        BiConsumer<Integer,String>integerStringBiConsumer=(x,y)-> System.out.println("Clave " + x + " Palabra " + y);
         integerStringMap.put(1,"Hola");
         integerStringMap.put(2,"Avion");
         integerStringMap.put(3,"Barco");
         integerStringMap.put(4,"Coche");
         integerStringMap.put(5,"Moto");
         integerStringMap.forEach(integerStringBiConsumer);


    }

}
