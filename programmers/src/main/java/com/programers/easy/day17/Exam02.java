package com.programers.easy.day17;

public class Exam02 {
    public static void main(String[] args) {
        String myString = "banana";
        String pat = "ana";
        int result = solution(myString, pat);
        System.out.println(result);
    }

    public static int solution(String myString, String pat) {
        int count = 0;
        for (int i = 0; i < myString.length(); i++) {
            i = myString.indexOf(pat, i);
            if(i == -1){
                break;
            }else{
                count++;
            }
        }
        return count;
    }
}
