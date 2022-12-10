package section2;

/*
4. 피보나치 수열
설명

1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.

2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.


입력
첫 줄에 총 항수 N(3<=N<=45)이 입력된다.


출력
첫 줄에 피보나치 수열을 출력합니다.


예시 입력 1

10
예시 출력 1

1 1 2 3 5 8 13 21 34 55
 */

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int cnt = scn.nextInt();
        for (int i : solution(cnt)) {
            System.out.print(i + " ");
        }
    }

    private static int[] solution(int cnt) {
        int[] result = new int[cnt];
        for(int i = 0; i < result.length; i++){
            if(i < 2){
                result[i] = 1;
            }else{
                result[i] = result[i-1] + result[i-2];
            }
        }
        return result;
    }

    //번외 배열 안쓰고 출력
    private static void solution2(int cnt){
        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for(int i = 2; i < cnt; i++){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
