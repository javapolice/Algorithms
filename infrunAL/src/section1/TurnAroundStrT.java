package section1;

import java.util.Scanner;

public class TurnAroundStrT {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String word = scn.nextLine();
//        String result = solution(word);
        String result = solution2(word);
        System.out.println(result);
    }

    private static String solution2(String word) {
        String reverseWord = new StringBuilder(word).reverse().toString();
        if(reverseWord.equalsIgnoreCase(word)) return "YES";
        else return "NO";
    }

    private static String solution(String word) {
        String result = "YES";
        word = word.toUpperCase();
        int len = word.length();
        for(int i = 0; i < len/2; i++){
            if(word.charAt(i) != word.charAt(len-i-1)) return "NO";
        }
        return result;
    }
}
