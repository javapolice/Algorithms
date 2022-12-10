package com.programers.basic.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MedianValue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] ints = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            ints[i] = Integer.parseInt(s[i]);
        }

        int result = solution(ints);
        System.out.println(result);
    }

    private static int solution(int[] ints) {
        Arrays.sort(ints);
        int midVal = ints.length / 2;
        return ints[midVal];
    }
}
