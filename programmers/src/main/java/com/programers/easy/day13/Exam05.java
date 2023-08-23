package com.programers.easy.day13;

import java.util.stream.IntStream;

public class Exam05 {
    public static void main(String[] args) {
        int[] num_list = {4, 2, 6, 1, 7, 6};
        int n = 2;
        int[] result = solution(num_list, n);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int[] num_list, int n) {
        return IntStream.range(0, num_list.length).filter(i->i%n==0).map(i -> num_list[i]).toArray();
    }
}
