package com.programers.easy.day11;

import java.util.stream.IntStream;

public class Exam02 {
    public static void main(String[] args) {
        int n = 10;
        int k = 3;
        int[] result = solution(n, k);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int n, int k) {
        int[] answer = IntStream.rangeClosed(1, n).filter(i -> i % k == 0).toArray();
        return answer;
    }
}
