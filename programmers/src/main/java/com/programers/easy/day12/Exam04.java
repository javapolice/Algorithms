package com.programers.easy.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exam04 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 2, 1, 10, 2, 1};
        int[] result = solution(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> indexTwo = IntStream.range(0, arr.length).filter(i -> arr[i] == 2).boxed().collect(Collectors.toList());
        if(indexTwo.isEmpty()){
            list.add(-1);
        }else if(indexTwo.size() == 1){
            list.add(2);
        }else{
            Integer start = indexTwo.get(0);
            Integer end = indexTwo.get(indexTwo.size() - 1);
            for (int i = start; i <= end; i++) {
                list.add(arr[i]);
            }
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
