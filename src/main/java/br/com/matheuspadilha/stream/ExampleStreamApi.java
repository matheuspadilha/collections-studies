package br.com.matheuspadilha.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleStreamApi {
    
    public static void main(String[] args) {
        
        // Cria a coleção de estudantes
        List<String> students = new ArrayList<>();
        
        // Adiciona 4 estudantes para a coleção
        students.add("Ben-hur");
        students.add("Rosemary");
        students.add("Ivy");
        students.add("Ralph");
        
        // Retorna a contagem de elementos da stream
        System.out.println("Contagem: " + students.stream().count());
        
        // Retorna o elemento com maior numero de letras
        System.out.println("Maior numero de letras: " + students.stream().max(Comparator.comparingInt(String::length)));
    
        // Retorna o elemento com menor numero de letras
        System.out.println("Menor numero de letras: " + students.stream().min(Comparator.comparingInt(String::length)));
        
        // Retorna os elementos que tem a letra R no nome
        System.out.println("Com a letra r no nome: " +
                students.stream().filter(student -> student.toLowerCase().contains("r")).collect(Collectors.toList()));
        
        // Retorna uma nova colecao, com os nomes concatenados a quantidade de letras de cada nome
        System.out.println("Retorna uma nova coleção com a quantidade de letras: " +
                students.stream().map(
                        student -> student.concat(" - ").concat(String.valueOf(student.length()))).collect(Collectors.toList()
                )
        );
        
        // Retorna somente os 3 primeiros elementos da colecao
        System.out.println("Retorna os 3 primeiros elementos: " + students.stream().limit(3).collect(Collectors.toList()));
        
        // Exibe cada elemento no console, e depois retorna a mesma colecao
        System.out.println("Retorna os elementos: " + students.stream().peek(System.out::println).collect(Collectors.toList()));
        
        // Exibe cada elemento no console sem retornar a outra colecao
        System.out.println("Retorna os elementos novamente: ");
        students.stream().forEach(System.out::println);
        
        // Retorna true se todos os elementos possuem a letra W no nome
        System.out.println("Todos os elemento tem o W no nome? " + students.stream().allMatch(element -> element.contains("W")));
        
        // Retorna true se algum dos elementos possuem a letra a minuscula no nome
        System.out.println("Tem algum elemento com a minúscula no nome? " + students.stream().anyMatch(element -> element.contains("a")));
        
        // Retorna o primeiro elemento da colecao, se existir exibe no console
        System.out.println("Retorna o primeiro elemento da coleção: ");
        students.stream().findFirst().ifPresent(System.out::println);
        
        // Exemplo de operacao encadeada
        System.out.println("Operação encadeada: ");
        System.out.println(students.stream()
                .peek(System.out::println)
                .map(student -> student.concat(" - ").concat(String.valueOf(student.length())))
                .peek(System.out::println)
                .filter(student -> student.toLowerCase().contains("r"))
                .collect(Collectors.toList())
//                .collect(Collectors.joining(", ")) // Transforma em uma string separada pelo caracter informado
//                .collect(Collectors.toSet()) // Tranforma em um set
//                .collect(Collectors.groupingBy(student -> student.substring(student.indexOf("-") + 1))) Aninha por grupos
        );
        
    }
}
