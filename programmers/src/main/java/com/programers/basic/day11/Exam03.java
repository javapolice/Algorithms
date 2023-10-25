package com.programers.basic.day11;

import java.util.Arrays;

public class Exam03 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int result = solution(numbers);
        System.out.println(result);
    }
    public static int solution(int[] numbers) {
        int[] answer = Arrays.stream(numbers).sorted().toArray();
        return answer[answer.length-1] * answer[answer.length-2];
    }
}
