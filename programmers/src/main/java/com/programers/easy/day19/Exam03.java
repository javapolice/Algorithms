package com.programers.easy.day19;

import java.util.Stack;

public class Exam03 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};
        int[] result = solution(arr, flag);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            int calVal = arr[i];
            if(flag[i]){
                for (int j = 0; j < calVal * 2; j++) {
                    stack.push(calVal);
                }
            }else{
                for (int j = 0; j < calVal; j++) {
                    stack.pop();
                }
            }
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
