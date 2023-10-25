package com.programers.easy.day25;

public class Exam04 {
    public static void main(String[] args) {
        int[][] board = {{0,1,2},{1,2,3},{2,3,4},{3,4,5}};
        int k = 2;
        int result = solution(board, k);
        System.out.println(result);
    }
    public static int solution(int[][] board, int k) {
        int result = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(i+j <= k) result += board[i][j];
            }
        }
        return result;
    }
}
