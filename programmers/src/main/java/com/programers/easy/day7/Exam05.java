package com.programers.easy.day7;

import java.util.ArrayList;
import java.util.Arrays;

public class Exam05 {
    public static int[] solution(int[] arr) {
        int i = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < arr.length){
            if(list.isEmpty()){
                list.add(arr[i]);
                i++;
            }else if(list.get(list.size()-1) < arr[i]){
                list.add(arr[i]);
                i++;
            }else{
                list.remove(list.size()-1);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] stk = {1, 4, 2, 5, 3};
        int[] result = solution(stk);
        Arrays.stream(result).forEach(System.out::println);
    }

}
