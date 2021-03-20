package bakForProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumEx {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cnt = Integer.parseInt(st.nextToken());
            Integer[] sum = new Integer[cnt];
            for (int i = 0; i < sum.length; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int val=0;
                while (st.hasMoreTokens()) {
                    val += Integer.parseInt(st.nextToken());
                }
                sum[i] = val;
            }
            for (int t : sum) {
                System.out.println(t);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
