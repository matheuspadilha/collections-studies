package br.com.matheuspadilha.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExampleTreeSet {
    
    public static void main(String[] args) {
    
        TreeSet<String> treeCapitais = new TreeSet<>();
        
        // Monta a arvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");
        System.out.println(treeCapitais);
        
        // Retorna a primeira capital no topo da arvore
        System.out.println(treeCapitais.first());
        
        // Retorna a ultima capital no final da arvore
        System.out.println(treeCapitais.last());
        
        // Retorna a primeira capital abaixo na arvore da capital parametrizada
        System.out.println(treeCapitais.lower("Florianópolis"));
        
        // Retorna a primeira capital acima na arvore da capital parametrizada
        System.out.println(treeCapitais.higher("Florianópolis"));
        
        // Exibe todas as capitais no console
        System.out.println(treeCapitais);
        
        // Retorna a primeira capital no topo da arvore. removendo do set
        System.out.println(treeCapitais.pollFirst());
        
        // Retorna a primeira capital no final da arvore. removendo do set
        System.out.println(treeCapitais.pollLast());
    
        // Exibe todas as capitais no console
        System.out.println(treeCapitais);
        
        // Navega em todos os itens do iterator
        Iterator<String> iterator = treeCapitais.iterator();
        while (iterator.hasNext()) {
            System.out.println("--->" + iterator.next());
        }
        
        for (String capital: treeCapitais) {
            System.out.println(capital);
        }
    }
}
