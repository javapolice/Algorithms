package com.programers.easy.day20;

import java.util.Arrays;

public class Exam02 {
    public static void main(String[] args) {
        int[] arr1 = {49, 13};
        int[] arr2 = {70, 11, 2};
        int result = solution(arr1, arr2);
        System.out.println(result);
    }
    public static int solution(int[] arr1, int[] arr2) {
        if(arr1.length > arr2.length){
            return 1;
        }else if(arr1.length < arr2.length){
            return -1;
        }else{
            int sum1 = Arrays.stream(arr1).sum();
            int sum2 = Arrays.stream(arr2).sum();
            if(sum1 > sum2){
                return 1;
            }else if(sum1 < sum2){
                return -1;
            }else {
                return 0;
            }
        }
    }
}
