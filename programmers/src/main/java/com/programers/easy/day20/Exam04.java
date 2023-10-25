package com.programers.easy.day20;

public class Exam04 {
    public static void main(String[] args) {
        int[] arr = {49, 12, 100, 276, 33};
        int n = 27;
        int[] result = solution(arr, n);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int[] arr, int n) {
        if(arr.length % 2 == 0){
            for (int i = 1; i < arr.length; i+=2) {
                arr[i] += n;
            }
        }else{
            for (int i = 0; i < arr.length; i+=2) {
                arr[i] += n;
            }
        }
        return arr;
    }
}
