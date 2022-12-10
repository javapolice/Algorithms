package section1;

import java.util.Scanner;

public class StringCompressionT {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        String answer = "";
        s = s + " ";
        int cnt = 1;
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)) cnt++;
            else{
                answer += s.charAt(i);
                if(cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }
        return answer;
    }
}
