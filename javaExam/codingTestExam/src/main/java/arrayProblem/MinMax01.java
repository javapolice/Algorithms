package arrayProblem;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MinMax01 {
    public static void main(String[] args) throws IOException {
        //기초작업
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //변수설정
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[cnt];
        for(int i = 0; i < nums.length; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        //계산
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[cnt-1];

        //출력
        bw.write(min + " " + max +"\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
