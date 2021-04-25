package br.com.matheuspadilha.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExampleHashSet {
    
    public static void main(String[] args) {
    
        Set<Double> studentNote = new HashSet<>();
        
        // Adiciona as notas no set
        studentNote.add(5.8);
        studentNote.add(9.3);
        studentNote.add(6.5);
        studentNote.add(10.0);
        studentNote.add(5.4);
        studentNote.add(7.3);
        studentNote.add(3.8);
        studentNote.add(4.0);
        studentNote.add(null);
        System.out.println(studentNote);
        
        // Remove a nota do set
        studentNote.remove(3.8);
        System.out.println(studentNote);
        
        // Retorna a quantidade de itens do set
        System.out.println(studentNote.size());
        
        // Navega em todos os itens do iterator
        Iterator<Double> iterator = studentNote.iterator();
        while (iterator.hasNext()) {
            System.out.println("--->" + iterator.next());
        }
        
        for (Double note: studentNote) {
            System.out.println(note);
        }
        
        studentNote.clear();
        
        // Retorna se o set esta vazio ou nao
        System.out.println(studentNote.isEmpty());
    }
}
