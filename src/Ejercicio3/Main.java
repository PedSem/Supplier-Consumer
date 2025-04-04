package Ejercicio3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String>strings= Arrays.asList(
                "Hola","que","tal","estas","queso","tomate","pan","pollo","Macarrones","Barbacoa"
        );
        Consumer<String>consumer=(Texto)-> System.out.println(Texto.substring(Texto.length()-1));
        strings.forEach(consumer);
    }

}
