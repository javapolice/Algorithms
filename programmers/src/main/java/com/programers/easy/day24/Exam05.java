package com.programers.easy.day24;

public class Exam05 {
    public static void main(String[] args) {
        int n = 3;
        int[][] result = solution(n);
        for (int[] ints : result) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j) answer[i][j] = 1;
            }
        }

        return answer;
    }
}
