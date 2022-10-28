package com.programers.basic.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ThrowBall {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().replaceAll("\\[|\\]| ", "").split(",");
        int[] numbers = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();
        int k = Integer.parseInt(br.readLine());
        int result = solution(numbers, k);
        System.out.println(result);
    }

    private static int solution(int[] numbers, int k) {
        int answer = 0;
        for (int i = 0; i < k - 1; i++) {
            answer = (answer+2) % numbers.length;
        }
        return numbers[answer];
    }


}
