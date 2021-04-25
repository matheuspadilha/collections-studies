package br.com.matheuspadilha.optionals;

import java.util.Optional;

public class ExampleOptional {
    
    public static void main(String[] args) {
        
        Optional<String> stringOptional = Optional.of("Valor opcional");
        System.out.println(stringOptional.isPresent());
        
        stringOptional.ifPresent(System.out::println);
        
        stringOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Valor não está presente"));
        
        if (stringOptional.isPresent()) {
            String valor = stringOptional.get();
            System.out.println(valor);
        }
        
        stringOptional.map((valor) -> valor.concat("***")).ifPresent(System.out::println);
        
        stringOptional.orElseThrow(IllegalStateException::new);
    }
}
