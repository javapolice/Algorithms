package section1;

import java.util.Scanner;

public class ShortestStrT {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        char c = scn.next().charAt(0);
        for (int i : solution(str,c)) {
            System.out.print(i + " ");
        }
    }

    private static int[] solution(String str, char c) {
        int[] answer = new int[str.length()];
        int tmp = 1000;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c){
                tmp = 0;
                answer[i] = tmp;
            }else{
                tmp++;
                answer[i] = tmp;
            }
        }

        tmp = 1000;
        for(int i = str.length()-1; i >= 0; i--){
            if(str.charAt(i) == c){
                tmp = 0;
            }else{
                tmp++;
                answer[i] = Math.min(answer[i], tmp);
            }
        }
        return answer;
    }
}
