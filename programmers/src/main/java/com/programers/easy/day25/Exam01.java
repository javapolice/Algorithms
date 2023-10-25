package com.programers.easy.day25;

public class Exam01 {
    public static void main(String[] args) {
        int n = 5;
        int[][] result = solution(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int val = 1;
        int x = 0;
        int y = 0;
        // 0 : 오른쪽 , 1 : 아래 , 2 : 왼쪽 , 3 : 위
        int direction = 0;

        while (val <= n*n) {
            answer[x][y] = val;
            val++;

            switch (direction) {
                case 0 -> {
                    if (y != n - 1 && answer[x][y + 1] == 0) {
                        y++;
                    } else {
                        x++;
                        direction = 1;
                    }
                }
                case 1 -> {
                    if (x != n - 1 && answer[x + 1][y] == 0) {
                        x++;
                    } else {
                        y--;
                        direction = 2;
                    }
                }
                case 2 -> {
                    if (y != 0 && answer[x][y - 1] == 0) {
                        y--;
                    } else {
                        x--;
                        direction = 3;
                    }
                }
                case 3 -> {
                    if (x != 0 && answer[x - 1][y] == 0) {
                        x--;
                    } else {
                        y++;
                        direction = 0;

                    }
                }
            }
        }
        return answer;
    }
}
