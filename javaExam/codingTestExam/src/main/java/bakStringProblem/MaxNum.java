package bakStringProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String a = st.nextToken();
        String b = st.nextToken();
        String[] as = a.split("");
        String[] bs = b.split("");
        String aNum = "";
        String bNum = "";
        for(int i = 2; i >= 0 ; i--){
            aNum+=as[i];
            bNum+=bs[i];
        }
        int max = 0;
        if(Integer.parseInt(aNum) > Integer.parseInt(bNum)){
            max = Integer.parseInt(aNum);
        }else{
            max = Integer.parseInt(bNum);
        }
        System.out.println(max);
        br.close();
    }
}
