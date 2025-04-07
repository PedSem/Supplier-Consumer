package Ejercicio14;

import java.time.LocalDate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Main main=new Main();
        Programador programador1=main.FabricaProgramadores(()->new Programador("Pedro"));
        System.out.println(programador1);
        Programador programador2=main.FabricaProgramadores(()->new Programador("Pedro",2,LocalDate.of(2022,5,1)));
        System.out.println(programador2);


    }
    public Programador FabricaProgramadores(Supplier<Programador>programadorSupplier){
        Programador programador=programadorSupplier.get();
        if(programador.getSalario()==0){
            programador.setSalario(50000);
        }
        if(programador.getFechainicio()==null){
            programador.setFechainicio(LocalDate.now());
        }
        return programador;



    }

}
