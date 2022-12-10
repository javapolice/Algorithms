package section2;

/*
1. 큰 수 출력하기
설명

N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.

(첫 번째 수는 무조건 출력한다)


입력
첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.


출력
자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.


예시 입력 1

6
7 3 9 5 6 12
예시 출력 1

7 9 6 12
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int cnt = scn.nextInt();
        int[] ints = new int[cnt];
        for(int i = 0; i < ints.length; i++){
            ints[i] = scn.nextInt();
        }
        //String result = solution(cnt, ints);
        //System.out.println(result);
        for (int i : solution2(cnt, ints)) {
            System.out.print(i + " ");
        }

    }

    private static ArrayList<Integer> solution2(int cnt, int[] ints) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(ints[0]);
        for(int i = 1; i < cnt; i++){
            if(ints[i] > ints[i-1]) integers.add(ints[i]);
        }
        return integers;
    }

    private static String solution(int cnt, int[] ints) {
        String result = "";
        for(int i = 0 ; i < ints.length; i++){
            if(i == 0){
                result += ints[i] + " ";
            }else{
                if(ints[i] > ints[i-1]){
                    result += ints[i] + " ";
                }
            }
        }
        return result;
    }
}
