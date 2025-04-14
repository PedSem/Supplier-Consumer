package Ejercicio9;
import java.util.function.BiConsumer;
public class Calculator {
    public static void main(String[] args) {
       int a=-9;
       int b=7;
        Calculator calculator=new Calculator();
        calculator.Calcula(a,b,(x,y)-> System.out.println(x+y));
        calculator.Calcula(a,b,(x,y)-> System.out.println(x-y));
        calculator.Calcula(a,b,(x,y)-> System.out.println(x/y));
    }
    public void Calcula(int x,int y,BiConsumer<Integer,Integer>calculadora){
       calculadora.accept(x,y);


    }
}
