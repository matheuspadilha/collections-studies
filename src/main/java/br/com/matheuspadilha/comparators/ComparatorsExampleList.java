package br.com.matheuspadilha.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExampleList {
    
    public static void main(String[] args) {
    
        List<Student> students = new ArrayList<>();
        
        students.add(new Student("Ben-hur", 28));
        students.add(new Student("Rosemary", 20));
        students.add(new Student("Emmett", 19));
        students.add(new Student("Ivy", 18));
        students.add(new Student("Evelyn", 21));
        students.add(new Student("Ralph", 18));
    
        System.out.println("--- Ordem de inserção ---");
        System.out.println(students);
        
        students.sort((first, second) -> first.getAge() - second.getAge());
        System.out.println("--- Ordem natural dos números - Idade ---");
        System.out.println(students);
        
        students.sort(Comparator.comparingInt(Student::getAge).reversed());
        System.out.println("--- Ordem reversa dos números - Idade (method reference) ---");
        System.out.println(students);
    
        Collections.sort(students);
        System.out.println("--- Ordem naturam dos números - Idade (Interface Comparable) ---");
        System.out.println(students);
    
        Collections.sort(students, new StudentOrderReverseAgeComparator());
        System.out.println("--- Ordem naturam dos números - Idade (Interface Comparator) ---");
        System.out.println(students);
    }
}
