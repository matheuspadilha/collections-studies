package br.com.matheuspadilha.map;

import java.util.Hashtable;
import java.util.Map;

public class ExampleHashTable {
    
    public static void main(String[] args) {
    
        Hashtable<String, Integer> students = new Hashtable<>();
        
        students.put("Camila", 21);
        students.put("Rosa", 33);
        students.put("Ivy", 18);
        students.put("Emmett", 40);
        System.out.println(students);
        
        students.put("Emmett", 55);
        System.out.println(students);
        
        // Remove um estudante no indice 0
        students.remove("Emmett");
        System.out.println(students);
        
        // Recupera um estudante no indice 2;
        int ageStudent = students.get("Rosa");
        System.out.println(ageStudent);
    
        System.out.println(students.size());
        
        // Navega nos registro do mapa
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
        
        // Navega nos registos do mapa
        for (String key : students.keySet()) {
            System.out.println(key + " -- " + students.get(key));
        }
    
        System.out.println(students);
    }
}
