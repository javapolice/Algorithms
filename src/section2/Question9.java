package section2;

import java.util.Scanner;

public class Question9 {
/*
9. 격자판 최대합
설명

5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.

Image1.jpg

N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.


입력
첫 줄에 자연수 N이 주어진다.(2<=N<=50)

두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.


출력
최대합을 출력합니다.


예시 입력 1

5
10 13 10 12 15
12 39 30 23 11
11 25 50 53 15
19 27 29 37 27
19 13 30 13 19
예시 출력 1
00 11 22 33 44
04 13 22 31 40
155
     */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int cnt = scn.nextInt();
        int[][] ints = new int[cnt][cnt];
        for(int i = 0; i < cnt; i++){
            for(int j = 0; i < cnt; j++){
                ints[i][j] = scn.nextInt();
            }
        }

        int result = solution(cnt, ints);
        System.out.println(result);

    }

    private static int solution(int cnt, int[][] ints) {
        int rowsSum = 0;
        int columnsSum = 0;
        int crossSum = 0;
        int crossSumR = 0;
        int x = 0;
        int y = cnt-1;

        for(int i = 0; i < cnt; i++){
            int tmpRows = 0;
            int tmpCols = 0;
            x++;
            y--;
            for(int j = 0; j < cnt; j++){
                tmpRows += ints[i][j];
                tmpCols += ints[j][i];
                if(i == j) crossSum += ints[i][j];
                if(i == x && j == y) crossSumR += ints[i][j];
            }
            if(rowsSum < tmpRows) rowsSum = tmpRows;
            if(columnsSum < tmpCols) columnsSum = tmpCols;
        }

        int result = Math.max(rowsSum, columnsSum);
        result = Math.max(result, crossSum);
        result = Math.max(result, crossSumR);

        return result;
    }


}
