package com.programers.easy.day18;

public class Exam03 {
    public static void main(String[] args) {
        String bi = "43 + 12";
        int result = solution(bi);
        System.out.println(result);
    }

    public static int solution(String binomial) {
        int answer = 0;
        String[] strings = binomial.split(" ");
        int val1 = Integer.parseInt(strings[0]);
        int val2 = Integer.parseInt(strings[2]);
        String op = strings[1];

        switch (op){
            case "+" :
                answer = val1 + val2;
                break;
            case "-" :
                answer = val1 - val2;
                break;
            case "*" :
                answer = val1 * val2;
                break;
        }
        return answer;
    }
}
