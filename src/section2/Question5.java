package section2;

import java.util.Scanner;

/*
5. 소수(에라토스테네스 체)
설명

자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.

만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.


입력
첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.


출력
첫 줄에 소수의 개수를 출력합니다.


예시 입력 1 

20
예시 출력 1

8
 */
public class Question5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int cnt = scn.nextInt();
//        int result = solution(cnt);
        int result = solution2(cnt);
        System.out.println(result);
    }

    //에라토스테네스 체
    private static int solution2(int cnt) {
        int result = 0;
        int[] primeNums = new int[cnt + 1];
        for(int i = 2; i <= cnt; i++){
            if(primeNums[i] == 0){
                result++;
                for(int j = i; j <= cnt; j+=i){
                    primeNums[j] = 1;
                }
            }
        }
        return result;
    }

    //time 1초초과
    private static int solution(int cnt) {
        int result = 0;
        for(int i = 2; i <= cnt; i++){
            int count = 0;
            for(int j = 1; j <= i; j++){
                if(i%j == 0){
                    count++;
                }
            }
            if(count == 2){
                result++;
            }
        }
        return result;
    }
}
