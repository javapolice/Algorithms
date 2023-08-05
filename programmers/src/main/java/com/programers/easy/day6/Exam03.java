package com.programers.easy.day6;

public class Exam03 {
    public static void main(String[] args) {
        int[] log = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        System.out.println(solution(log));

    }

    public static String solution(int[] numLog) {
        String answer = "";

        for (int i = 0; i < numLog.length - 1; i++) {
            int cha = numLog[i + 1] - numLog[i];
            switch (cha) {
                case 1:
                    answer += "w";
                    break;
                case -1:
                    answer += "s";
                    break;
                case 10:
                    answer += "d";
                    break;
                case -10:
                    answer += "a";
                    break;
                default:
                    break;
            }
        }

        return answer;
    }
}
