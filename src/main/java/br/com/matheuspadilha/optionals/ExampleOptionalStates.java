package br.com.matheuspadilha.optionals;

import java.util.Optional;

public class ExampleOptionalStates {
    
    public static void main(String[] args) {
    
        Optional<String> stringOptional = Optional.of("Valor Presente");
    
        System.out.println("Valor opcional que está presente");
        stringOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Não está Presente"));
        
        Optional<String> nullOptional = Optional.ofNullable(null);
        System.out.println("Valor opcional que não está presente");
        nullOptional.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está Presente"));
    
        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Valor opcional que não está presente");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está Presente"));
        
//        Optional<String> nullOptionalError = Optional.of(null);
//        System.out.println("Valor opcional que lança erro NullPointerException");
//        nullOptionalError.ifPresentOrElse(System.out::println, () -> System.out.println("erro = não está Presente"));
    }
}
