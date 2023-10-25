package com.programers.easy.day20;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Exam01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] result = solution(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int[] arr) {
        int[] answer = {};

        int length = arr.length;
        int cnt = 0;
        while ((int)Math.pow(2,cnt) < length){
            cnt++;
        }
        int pow = (int) Math.pow(2, cnt);
        if(length != pow){
            answer = IntStream.concat(Arrays.stream(arr), IntStream.range(0, pow).map(i -> 0)).limit(pow).toArray();
        }else {
            answer = arr;
        }
        return answer;
    }
}
