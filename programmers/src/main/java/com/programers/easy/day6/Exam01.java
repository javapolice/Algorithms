package com.programers.easy.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam01 {
    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        int[] solution = solution(num_list);
        Arrays.stream(solution).forEach(num -> System.out.println(num));
    }

    public static int[] solution(int[] num_list) {
        List<Integer> list = new ArrayList<>();

        int lastVal = num_list[num_list.length-1];
        int beforeLastVal = num_list[num_list.length-2];
        int resultVal = 0;

        if(lastVal > beforeLastVal){
            resultVal = lastVal - beforeLastVal;
        }else {
            resultVal = lastVal * 2;
        }

        for (int i : num_list) {
            list.add(i);
        }
        list.add(resultVal);

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
