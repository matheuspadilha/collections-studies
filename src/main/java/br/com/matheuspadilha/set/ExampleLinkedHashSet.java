package br.com.matheuspadilha.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExampleLinkedHashSet {
    
    public static void main(String[] args) {
    
        LinkedHashSet<Integer> numberSequence = new LinkedHashSet<>();
        
        // Adiciona os numeros no set
        numberSequence.add(1);
        numberSequence.add(2);
        numberSequence.add(3);
        numberSequence.add(4);
        numberSequence.add(7);
        numberSequence.add(99);
        System.out.println(numberSequence);
        
        // Remove o numero do set
        numberSequence.remove(4);
        System.out.println(numberSequence);
        
        // Retorna a quantidade de itens do set
        System.out.println(numberSequence.size());
    
        Iterator<Integer> iterator = numberSequence.iterator();
        while (iterator.hasNext()) {
            System.out.println("--->" + iterator.next());
        }
        
        for (Integer number: numberSequence) {
            System.out.println(number);
        }
        
        numberSequence.clear();
        
        // Retorna se o set esta vazio ou nao
        System.out.println(numberSequence.isEmpty());
    }
}
