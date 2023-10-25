package com.programers.easy.day19;

import java.util.*;
import java.util.stream.IntStream;

public class Exam05 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 1};
        int k = 4;
        int[] result = solution2(arr, k);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if(list.size() == k){
                break;
            }else{
                if(!list.contains(i)){
                    list.add(i);
                }
            }
        }
        if(list.size() < k){
            int cnt = k - list.size();
            for (int i = 0; i < cnt; i++) {
                list.add(-1);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] solution2(int[] arr, int k) {
        return IntStream.concat(Arrays.stream(arr).distinct(),IntStream.range(0,k).map(i->-1)).limit(k).toArray();
    }
}
