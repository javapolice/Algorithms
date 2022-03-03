package section1;

import java.util.Scanner;

public class ExtractNumbersT {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String word = scn.nextLine();
        //int result = solution(word);
        int result = solution2(word);

        System.out.println(result);
    }

    private static int solution2(String word) {
        String answer = "";
        for (char c : word.toCharArray()) {
            if(Character.isDigit(c)) answer += c;
        }
        return Integer.parseInt(answer);
    }

    private static int solution(String word) {
        int answer = 0;
        for (char c : word.toCharArray()) {
            if(c >= 48 && c <= 57) answer = answer*10 + (c-48);
        }

        return answer;
    }
}
