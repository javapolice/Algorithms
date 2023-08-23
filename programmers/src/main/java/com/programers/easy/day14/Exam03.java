package com.programers.easy.day14;

import java.util.stream.IntStream;

public class Exam03 {
    public static void main(String[] args) {
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true, false, true, false};
        String[] result = solution(todo_list, finished);
        for (String s : result) {
            System.out.print(s + " ");
        }
    }

    public static String[] solution(String[] todo_list, boolean[] finished) {
        return IntStream.range(0,finished.length).filter(i -> finished[i] == false).mapToObj(i -> todo_list[i]).toArray(String[]::new);
    }
}
