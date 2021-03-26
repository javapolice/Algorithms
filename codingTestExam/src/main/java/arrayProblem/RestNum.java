package arrayProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class RestNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[10];
        for(int i = 0; i < nums.length; i++){
            nums[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]%42);
        }
        System.out.println(set.size());
    }
}
