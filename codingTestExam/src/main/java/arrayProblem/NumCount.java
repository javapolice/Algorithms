package arrayProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        br.close();

        int[] nums = new int[10];
        String[] result = String.valueOf(a * b * c).split("");
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(Integer.parseInt(result[i]) == j){
                    nums[j]++;
                }
            }
        }
        for(int num : nums){
            System.out.println(num);
        }
    }
}
