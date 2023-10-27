package com.programers.basic.day14;


public class Exam01 {
    public static void main(String[] args) {
        int[] array = {3, 10, 28};
        int n = 20;
        int result = solution(array, n);
        System.out.println(result);
    }

    public static int solution(int[] array, int n) {
        int answer = 9999;
        int result = 9999;
        for (int i : array) {
            if(Math.abs(n-i) < answer) {
                answer = Math.abs(n-i);
                result = i;
            }else if(Math.abs(n-i) == answer){
                result = result > i ? i : result;
            }
        }
        return result;
    }
}
