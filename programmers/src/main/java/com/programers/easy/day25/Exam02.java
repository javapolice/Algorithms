package com.programers.easy.day25;

public class Exam02 {
    public static void main(String[] args) {
        int[][] arr = {{5,192,33},{192,72,95},{33,95,999}};
        int result = solution(arr);
        System.out.println(result);
    }

    public static int solution(int[][] arr) {
        int answer = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] != arr[j][i]) return 0;
            }
        }
        return answer;
    }
}
