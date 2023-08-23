package com.programers.easy.day15;

import java.util.Arrays;

public class Exam04 {
    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
        int result = solution(num_list);
        System.out.println(result);
    }
    public static int solution(int[] num_list) {
        int answer = 0;

        if(num_list.length > 10){
            answer = Arrays.stream(num_list).sum();
        }else{
            answer = Arrays.stream(num_list).reduce((x, y) -> x * y).getAsInt();
        }

        return answer;
    }
}
