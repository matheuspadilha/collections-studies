package br.com.matheuspadilha.comparators;

public class Student implements Comparable<Student> {
    
    private final String name;
    private final Integer age;
    
    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public Integer getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return "{" +
                "name:'" + name + '\'' +
                ", age:" + age +
                '}';
    }
    
    @Override
    public int compareTo(Student o) {
        return this.getAge() - o.getAge();
    }
}
