package br.com.matheuspadilha.map;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {
    
    public static void main(String[] args) {
    
        Map<String, Integer> fifaWorldChampions = new HashMap<>();
        
        // Adiciona os campeoes mundiais fifa no mapa
        fifaWorldChampions.put("Brasil", 5);
        fifaWorldChampions.put("Alemanha", 4);
        fifaWorldChampions.put("Itália", 4);
        fifaWorldChampions.put("Uruguai", 2);
        fifaWorldChampions.put("Argentina", 2);
        fifaWorldChampions.put("França", 2);
        fifaWorldChampions.put("Inglaterra", 1);
        fifaWorldChampions.put("Espanha", 1);
        System.out.println(fifaWorldChampions);
        
        // Atualiza o valor para a chave Brasil
        fifaWorldChampions.put("Brasil", 6);
        System.out.println(fifaWorldChampions);
        
        // Retorna a Argentina
        System.out.println(fifaWorldChampions.get("Argentina"));
        
        // Retorna se existe ou nao um campeao Franca
        System.out.println(fifaWorldChampions.containsKey("França"));
        
        // Remove o campeao Franca
        fifaWorldChampions.remove("França");
        System.out.println(fifaWorldChampions.containsKey("França"));
        
        // Retorna se existe ou nao alguma selecao hexa campea
        System.out.println(fifaWorldChampions.containsValue(6));
        
        // Retorna o tamanho do mapa
        System.out.println(fifaWorldChampions.size());
        
        System.out.println(fifaWorldChampions);
        
        // Navega nos registros do mapa
        for (Map.Entry<String, Integer> entry: fifaWorldChampions.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
    
        // Navega nos registros do mapa
        for (String key : fifaWorldChampions.keySet()) {
            System.out.println(key + " -- " + fifaWorldChampions.get(key));
        }
    
        System.out.println(fifaWorldChampions);
        
        // Verifica se o mapa contam a chave Estados Unidos
        System.out.println(fifaWorldChampions.containsKey("Estados Unidos"));
        
        // Verifica se o mapa contam o valor 5
        System.out.println(fifaWorldChampions.containsValue(5));
        
        // Verficar o tamanhao antes e depois de limpar o mapa
        System.out.println(fifaWorldChampions.size());
        fifaWorldChampions.clear();
        System.out.println(fifaWorldChampions.size());
    }
}
