package com.programers.basic.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Array2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().replaceAll("\\[|\\]| ", "").split(",");
        int[] num_list = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(br.readLine());
        int[][] result = solution(num_list,n);
        System.out.println(Arrays.deepToString(result));
    }

    private static int[][] solution(int[] num_list, int n) {
        Queue<Integer> list = new LinkedList<>();
        for (int i : num_list) {
            list.offer(i);
        }
        int[][] answer = new int[num_list.length/n][n];
        for (int i = 0; i < num_list.length/n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = list.poll();
            }
        }
        return answer;
    }
}
