package com.conceptpractice;

import java.util.stream.Stream;

public class ParallelDemo {
    public static void main(String[] args) {
        System.out.println("======Serial Stream==========");
        Stream<Integer> stream = Stream.of(1, 2, 3, 4);
        stream.forEach(i -> System.out.println(i + " " + Thread.currentThread()));

        System.out.println("======Parallel Stream==========");
        Stream<Integer> ss = Stream.of(1, 2, 3, 4);
        ss.parallel().forEach(n-> System.out.println(n + " " + Thread.currentThread()));
    }
}
