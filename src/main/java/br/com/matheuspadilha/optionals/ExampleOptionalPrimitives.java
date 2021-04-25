package br.com.matheuspadilha.optionals;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExampleOptionalPrimitives {
    
    public static void main(String[] args) {
    
        System.out.println("*** Valor Inteiro opcional ***");
        OptionalInt.of(12).ifPresent(System.out::println);
    
        System.out.println("*** Valor Decimal opcional ***");
        OptionalDouble.of(55.2).ifPresent(System.out::println);
    
        System.out.println("*** Valor Longo opcional ***");
        OptionalLong.of(23L).ifPresent(System.out::println);
    }
}
