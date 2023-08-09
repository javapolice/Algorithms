package com.programers.easy.day10;

import java.util.*;

public class Exam04 {
    public static void main(String[] args) {
        String my_string = "ihrhbakrfpndopljhygc";
        int m = 4;
        int c = 2;

        System.out.println(solution(my_string, m, c));
    }

    public static String solution(String my_string, int m, int c) {
        String answer = "";

        Queue<String> que = new LinkedList<>();
        for (String s : my_string.split("")) {
            que.add(s);
        }

        ArrayList<String> list = new ArrayList<>();

        String s = "";
        while(!que.isEmpty()){
            s += que.poll();
            if(s.length() == m){
                list.add(s);
                s = "";
            }
        }

        for (String s1 : list) {
            answer += s1.charAt(c-1);

        }

        return answer;
    }
}
