package com.programers.easy.day15;

import java.util.Arrays;

public class Exam03 {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 1, 14};
        int result = solution(num_list);
        System.out.println(result);
    }

    public static int solution(int[] num_list) {
        int sum = Arrays.stream(num_list).map(i -> {
            int cnt = 0;
            while (i != 1) {
                if (i % 2 == 0) {
                    i /= 2;
                } else {
                    i = (i - 1) / 2;
                }
                cnt++;
            }
            return cnt;
        }).sum();
        return sum;
    }
}
