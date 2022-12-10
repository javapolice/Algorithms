package com.programers.basic.day5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().replaceAll("\\[| |\\]", "").split(",");
        int[] ints = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
        int[] result = solution(ints);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] num_list) {

        for (int i = 0; i < num_list.length/2; i++) {
            int temp = num_list[i];
            num_list[i] = num_list[num_list.length-i-1];
            num_list[num_list.length-i-1] = temp;
        }
        return num_list;
    }

}
