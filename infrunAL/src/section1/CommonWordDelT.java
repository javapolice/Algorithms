package section1;

import java.util.Scanner;

public class CommonWordDelT {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String word = scn.nextLine();
        String result = solution(word);
        System.out.println(result);
    }

    private static String solution(String word) {
        String answer = "";
        for(int i = 0; i < word.length(); i++){
//            System.out.println(word.charAt(i) + " " + i + " " + word.indexOf(word.charAt(i)));
            if(word.indexOf(word.charAt(i)) == i){
                answer += word.charAt(i);
            }
        }
        return answer;
    }
}
