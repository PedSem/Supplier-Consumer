package Ejercicio9;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Calculator {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        Calculator calculator=new Calculator();
        int suma=calculator.Calcula(a,b,(x,y)->x+y);
        int resta=calculator.Calcula(a,b,(x,y)->x-y);
        int multiplicacion=calculator.Calcula(a,b,(x,y)->x*y);
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);



    }
    public int Calcula(int x, int y, BiFunction<Integer,Integer,Integer>opera){
        return opera.apply(x,y);
    }
}
