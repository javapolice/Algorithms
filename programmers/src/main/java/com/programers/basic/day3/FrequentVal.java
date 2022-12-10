package com.programers.basic.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FrequentVal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] ints = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
        int result = solution(ints);
        System.out.println(result);
    }

    private static int solution(int[] ints) {
        int minVal = Arrays.stream(ints).min().getAsInt();
        int midVal = 0;
        if(minVal < 0){
            midVal = 0-minVal;
        }
        int finalMidVal = midVal;
        int[] array = Arrays.stream(ints).map(i -> i + finalMidVal).toArray();
        int maxVal = Arrays.stream(array).max().getAsInt();

        long[] freArr = new long[maxVal + 1];
        for (int i = 0; i < array.length; i++) {
            freArr[array[i]]++;
        }
        if (array.length == 1) {
            return array[0] - finalMidVal;
        } else {
            int count = 1;
            long max = freArr[0];
            int index = 0;
            for (int i = 0; i < freArr.length - 1; i++) {
                if (max == freArr[i + 1]) {
                    count++;
                } else if (max < freArr[i + 1]) {
                    max = freArr[i + 1];
                    index = i+1;
                    count = 1;
                } else {
                }
            }
            if (count > 1) {
                return -1;
            } else {
                return index - finalMidVal;
            }
        }

    }
}
