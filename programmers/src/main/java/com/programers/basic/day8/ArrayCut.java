package com.programers.basic.day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


//입문 lv.0 배열 자르기
public class ArrayCut {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().replaceAll("\\[|\\]| ", "").split(",");
        int[] numbers = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int[] result = solution2(numbers,num1,num2);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] numbers, int num1, int num2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = num1; i <= num2; i++) {
            list.add(numbers[i]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] solution2(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
