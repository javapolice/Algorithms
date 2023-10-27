package com.programers.basic.day15;

import java.util.HashSet;
import java.util.stream.IntStream;

public class Exam04 {
    public static void main(String[] args) {
        int n = 24;
        int[] result = solution2(n);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i * i <= n; i++) {
            if(n % i == 0) {
                set.add(i);
                set.add(n/i);
            }
        }
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    public static int[] solution2(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
    }
}
