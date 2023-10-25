package com.programers.easy.day25;

public class Exam03 {
    public static void main(String[] args) {
        int[][] arr = {{572,22,37},{287,726,384},{85,137,292},{487,13,876}};
        int[][] result = solution(arr);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] solution(int[][] arr) {
        int column = arr.length;
        int row = arr[0].length;

        if(column > row){
            int[][] ints = new int[column][column];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    ints[i][j] = arr[i][j];
                }
            }
            return ints;
        }else if(column < row){
            int[][] ints = new int[row][row];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    ints[i][j] = arr[i][j];
                }
            }
            return ints;
        }else{
            return arr;
        }
    }
}
