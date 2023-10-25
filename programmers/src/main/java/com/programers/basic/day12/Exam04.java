package com.programers.basic.day12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Exam04 {
    public static void main(String[] args) {
        int n = 12;
        int[] result = solution(n);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int n) {
        HashSet<Integer> factors = new HashSet<>();
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
