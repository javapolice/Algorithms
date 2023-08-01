package com.programers.easy.day4;

public class Exam04 {
    public static void main(String[] args) {
        System.out.println(solution(">","!",41,78));
    }

    public static int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        String equals = ineq + eq;

        switch (equals){
            case "<=" :
                answer = (n <= m) ? 1 : 0;
                break;
            case "<!" :
                answer = (n < m) ? 1 : 0;
                break;
            case ">=" :
                answer = (n >= m) ? 1 : 0;
                break;
            case ">!" :
                answer = (n > m) ? 1 : 0;
                break;
        }

        return answer;
    }
}
