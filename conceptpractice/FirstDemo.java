package com.conceptpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FirstDemo {

    public static void main(String[] args) {
//        Stream<Integer> stream = Stream.of(12,50,60,50);
//        List<String> names = new ArrayList<>();
//        names.add("john");
//        names.add("robert");
//        names.add("abc");
//        Stream<String> stream1 = names.stream();
//        stream1.filter(name -> name.startsWith("R")).forEach(i -> System.out.println(i));
//        names.stream().map(name -> name.toUpperCase()).forEach(i -> System.out.println(i));
//        List<String> list = Arrays.asList("Ashok","Anil","Raju","Rani","John","Akash","Chales");
//
//        list.stream().filter(name ->name.startsWith("A")).map(i-> i + "-"+ i.length()).forEach(a-> System.out.println(a));

        List<String>javacources = Arrays.asList("core java", "adv java","springboot", "Rest Api","Microservices");
//        List<String> uicources = Arrays.asList("html","css","bs","js");
//
//        List<List<String>> cources = Arrays.asList(javacources,uicources);
//
//        cources.stream().flatMap(i -> i.stream()).forEach(a-> System.out.println(a));

        javacources.stream().limit(3).forEach(i -> System.out.println(i));

    }
}
