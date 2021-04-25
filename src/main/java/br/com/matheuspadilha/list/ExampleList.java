package br.com.matheuspadilha.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExampleList {
    
    public static void main(String[] args) {
    
        List<String> names = new ArrayList<>();
        
        names.add("Emmett");
        names.add("Benhur");
        names.add("Rosa");
        names.add("Evelyn");
        
        System.out.println(names);
    
        // metodo de atualizacao
        names.set(3, "Ivy");
        System.out.println(names);
        
        // ordenar de forma alfabetica
        Collections.sort(names);
        names.set(0, "Ben-hur");
        System.out.println(names);
        
        // remove um elemento pelo indice
        names.remove(2);
        System.out.println(names);
    
        // remove elemento pelo objeto
        names.remove("Emmett");
        System.out.println(names);
        
        // buscar um elemento pelo indice
        String name = names.get(1);
        System.out.println(name);
        
        // busca por um elemento e retorna a posicao do mesmo
        int position = names.indexOf("Ivy");
        System.out.println(position);
        
        // buscar tamanho da lista
        int size = names.size();
        System.out.println(size);
        
        // verificar se um objeto tem na lista
        boolean findRosa = names.contains("Rosa");
        System.out.println(findRosa);
    
        // navegando na lista
        for (String itemName: names) {
            System.out.println("--->" + itemName);
        }
        
        // o iterator pode ser navegado atraves de um while e prove dois metodos hasNext e next
        Iterator<String> iterator = names.iterator();
        // verifica se tem proximo elemento
        while (iterator.hasNext()) {
            // retorna o objeto
            System.out.println("----->" + iterator.next());
        }
        
        // limpa toda a lista
        names.clear();
        
        // verificar se a lista esta vazia
        boolean isEmpty = names.isEmpty();
        System.out.println(isEmpty);
        
    }
    
}
