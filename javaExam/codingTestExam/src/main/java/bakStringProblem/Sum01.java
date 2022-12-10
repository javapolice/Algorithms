package bakStringProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        Integer[] nums = new Integer[cnt];
        String[] temp = br.readLine().split("");
        for(int i = 0; i < nums.length; i++){
            nums[i] = Integer.parseInt(temp[i]);
        }

        int sum = 0;
        for(int t : nums){
            sum += t;
        }
        br.close();
        System.out.println(sum);
    }
}
