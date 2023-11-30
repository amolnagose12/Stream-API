package com.conceptpractice;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    String name;
    int age;
    double salary;
    String country;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee(String name, int age, double salary, String country) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", country='" + country + '\'' +
                '}';
    }

    public static void main(String[] args) {
//        Employee emp1 = new Employee("Amol",29,50000);
//        Employee emp2 = new Employee("Nikhil",30,40000);
//        Employee emp3 = new Employee("Nilesh",45,60000);
//        Employee emp4 = new Employee("Sanjay",50,70000);

        Employee emp1 = new Employee("Amol",29,50000,"India");
        Employee emp2 = new Employee("Nikhil",30,40000,"USA");
        Employee emp3 = new Employee("Nilesh",45,60000,"China");
        Employee emp4 = new Employee("Sanjay",50,70000,"UK");
        Employee emp5 = new Employee("Sanjay",29,70000,"UK");
        Employee emp6 = new Employee("Sanjay",30,70000,"UK");
        Employee emp7 = new Employee("Sanjay",35,70000,"UK");

//        Map<Integer,Set<Employee>> data = Stream.of(emp1,emp2,emp3,emp4,emp5,emp6,emp7).collect(Collectors.groupingBy(e->e.getAge(), Collectors.toSet()));

//        System.out.println(data);

        List<Employee> list = Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6,emp7);
        Optional<Employee> maxage = list.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.getAge())));

        System.out.println(maxage);
//        Stream<Employee> list = Stream.of(emp1,emp2,emp3,emp4);

//        list.stream().filter(i ->i.salary>=50000).map(name -> name.name + " "+ name.age).forEach(a -> System.out.println(a));
//
//         Optional<Employee> maxSalary = list.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.salary)));
//         Optional<Employee> minSalary = list.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.salary)));
//
//        System.out.println(maxSalary.get().salary);
//        System.out.println(minSalary.get().salary);

//        Map<String, List<Employee>> collect = list.stream().collect(Collectors.groupingBy(o -> o.country));
//
//        System.out.println(collect);
    }
}
