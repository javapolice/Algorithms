package com.programers.easy.day19;

import java.util.Stack;

public class Exam04 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0};
        int[] result = solution(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
    public static int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i : arr) {
            if(stack.isEmpty()){
                stack.push(i);
            }else {
                if(stack.peek() == i){
                    stack.pop();
                }else{
                    stack.push(i);
                }
            }
        }

        if(stack.isEmpty()){
            return new int[]{-1};
        }else {
            return stack.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}
