package com.programers.easy.day5;

public class Exam02 {
    public static void main(String[] args) {
        int a = 3;
        int d = 4;
        boolean[] included = {true,false,false,true,true};

        System.out.println(solution(a,d,included));
    }

    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;

        for (int i = 0; i < included.length; i++) {
            if(included[i] == true){
                answer += a;
            }
            a += d;
        }
        return answer;
    }
}
