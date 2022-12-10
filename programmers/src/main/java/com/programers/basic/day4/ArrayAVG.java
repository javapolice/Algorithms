package com.programers.basic.day4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayAVG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().replaceAll("\\[|\\]| ","").split(",");
        int[] ints = Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();
        double result = solution(ints);
        System.out.println(result);
    }

    private static double solution(int[] numbers) {
        int length = numbers.length;
        double sum = Arrays.stream(numbers).mapToDouble(i -> i).sum();
        return sum / length;
    }
}
