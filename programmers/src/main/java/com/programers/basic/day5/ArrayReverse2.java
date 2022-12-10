package com.programers.basic.day5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayReverse2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().replaceAll("\\[| |\\]", "").split(",");
        int[] ints = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
        int[] result = solution(ints);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] num_list) {
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());

        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
