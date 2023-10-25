package com.programers.easy.day23;

import java.util.Arrays;

public class Exam03 {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        int n = 3;
        int result = solution(num_list, n);
        System.out.println(result);
    }

    public static int solution(int[] num_list, int n) {
        int answer = 0;
        for (int i : num_list) {
            if(i == n) answer = 1;
        }
        return answer;
    }
}
