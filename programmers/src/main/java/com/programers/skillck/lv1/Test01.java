package com.programers.skillck.lv1;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Test01 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        int[] result = solution(array, commands);
        for (int i : result) {
            System.out.println(i + " ");
        }
    }

    public static int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int[] command : commands) {
            int[] sortedArr = IntStream.rangeClosed(command[0] - 1, command[1] - 1).map(i -> array[i]).sorted().toArray();
            list.add(sortedArr[command[2]-1]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
