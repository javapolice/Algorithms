package com.programers.easy.day8;

public class Exam01 {
    public static void main(String[] args) {
        boolean x1 = false;
        boolean x2 = true;
        boolean x3 = true;
        boolean x4 = true;

        boolean result = solution(x1, x2, x3, x4);
        System.out.println(result);

    }

    public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean rgx1 = false;
        boolean rgx2 = false;
        boolean answer = false;
        if(x1 || x2){
            rgx1 = true;
        }

        if(x3 || x4){
            rgx2 = true;
        }

        if(rgx1 && rgx2){
            answer = true;
        }
        return answer;
    }
}
