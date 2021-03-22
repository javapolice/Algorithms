package bakForProblem;

import java.io.*;
import java.util.StringTokenizer;

public class MinNum {
    public static void main(String[] args) throws IOException {
        /*FileReader fr = new FileReader("C:\\intelliJ\\codingTestExam\\src\\main\\resources\\minNum.txt");
        BufferedReader br = new BufferedReader(fr);*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int cnt = Integer.parseInt(st.nextToken());
        int baseNum = Integer.parseInt(st.nextToken());
        int[] nums = new int[cnt];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < nums.length; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        for (int num : nums) {
            if (num < baseNum) {
                bw.write(num + " ");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
