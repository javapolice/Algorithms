package com.programers.basic.day11;

import java.util.stream.IntStream;

public class Exam02 {
    public static void main(String[] args) {
        int n = 15;
        int result = solution(n);
        System.out.println(result);
    }
    public static int solution(int n) {
        long count = IntStream.rangeClosed(1, n).filter(i -> IntStream.rangeClosed(1, i).filter(a -> i % a == 0).count() >= 3).count();
        return (int)count;
    }
}
