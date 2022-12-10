import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class MaxAL {
    public static void main(String[] args) throws IOException {
        //초기작업
        FileReader fr = new FileReader("C:\\intelliJ\\m03CoTe\\src\\main\\resources\\maxAL.txt");
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //변수설정
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int indexSize = Integer.parseInt(st.nextToken());
        int sumCnt = Integer.parseInt(st.nextToken());
        int minCnt = Integer.parseInt(st.nextToken());

        Integer[] nums = new Integer[indexSize];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums, Collections.reverseOrder());

        /*//계산 1
        int count = 1;
        int result = 0;
        for (int i = 0; i < minCnt; i++) {
            result += nums[0];
            count++;
        }
            if (nums[0] != nums[1]) {
                while(count <= sumCnt){
                    if(count % (minCnt+1) == 0){
                        result += nums[1];
                        count++;
                    }else{
                        for (int i = 0; i < minCnt; i++) {
                            result += nums[0];
                            count++;
                            if (count > sumCnt) {
                                break;
                            }
                        }
                    }
                }
            }else {
                while(count <= sumCnt) {
                    for (int i = 0; i < minCnt; i++) {
                        result += nums[0];
                        count++;
                        if (count > sumCnt) {
                            break;
                        }
                    }
                }
            }*/
        //계산 2
        int result = 0;
        int maxNum = nums[0];
        int secondNum = nums[1];
        result = ((maxNum*minCnt)+secondNum) * (sumCnt/(minCnt+1));
        result += maxNum*(sumCnt%(minCnt+1));

        //결과출력
        bw.write(String.valueOf(result));
        br.close();
        bw.flush();
        bw.close();
    }
}
