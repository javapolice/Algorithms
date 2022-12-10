package arrayProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinMax02NotArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = -1;
        int maxCnt = 0;
        int count = 0;
        while(count < 9){
            int num = Integer.parseInt(br.readLine());
            count++;
            if(max < num){
                max = num;
                maxCnt = count;
            }
        }
        br.close();
        System.out.println(max);
        System.out.println(maxCnt);
    }
}
