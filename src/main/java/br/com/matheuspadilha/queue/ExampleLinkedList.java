package br.com.matheuspadilha.queue;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExampleLinkedList {
    
    public static void main(String[] args) {
    
        Queue<String> queueBank = new LinkedList<>();
        
        queueBank.add("Evilyn");
        queueBank.add("Ben-hur");
        queueBank.add("Rosa");
        queueBank.add("Emmett");
        queueBank.add("Ivy");
        System.out.println(queueBank);
        
        // busca pelo primeiro cliente e o remove da fila, caso nao tenha sera retornado null
        String clientToBeAttended = queueBank.poll();
        System.out.println(clientToBeAttended);
        System.out.println(queueBank);
        
        // busca o primeiro cliente e não o remove da fila, caso nao tenha sera retornado null
        String firstClient = queueBank.peek();
        System.out.println(firstClient);
        System.out.println(queueBank);
        
        // limpar a fila
//        queueBank.clear();
        
        // busca o primeiro cliente e não o remove da fila, caso nao tenha estoura uma exception
        String firstClientOrError = queueBank.element();
        System.out.println(firstClientOrError);
        System.out.println(queueBank);
        
        for (String client: queueBank) {
            System.out.println(client);
        }
        
        Iterator<String> iteratorQueueBank = queueBank.iterator();
        while (iteratorQueueBank.hasNext()) {
            System.out.println("--->" + iteratorQueueBank.next());
        }
    
        System.out.println(queueBank.size());
        
        System.out.println(queueBank.isEmpty());
        
    }
    
}
