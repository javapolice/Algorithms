package com.programers.basic.day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


//입문 lv.0 진료순서 정하기
public class MedicalList {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().replaceAll("\\[|\\]| ", "").split(",");
        int[] numbers = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();
        int[] result = solution(numbers);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j <answer.length; j++) {
                if(numbers[i] <= numbers[j]){
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}
