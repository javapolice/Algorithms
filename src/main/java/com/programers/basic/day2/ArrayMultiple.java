package com.programers.basic.day2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayMultiple {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(",");
        int[] ints = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            ints[i] = Integer.parseInt(s[i]);
        }
        int[] result = solution(ints);
        for (int i : result) {
            System.out.print(i + ",");
        }
    }

    private static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }

}
