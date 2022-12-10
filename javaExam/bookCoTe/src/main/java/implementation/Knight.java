package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Knight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String loc = br.readLine();
        int x = loc.charAt(0)-'a'+1;
        int y = Integer.parseInt(loc.substring(1));
        int[] xs = {-2,-2,2,2,-1,1,-1,1};
        int[] ys = {-1,1,-1,1,-2,-2,2,2};
        int cnt = 0;
        for(int i = 0; i < xs.length; i++){
            int tempx = x + xs[i];
            int tempy = y + ys[i];
            if(tempx >= 1 && tempx <=8 && tempy >= 1 && tempy <= 8){
                cnt++;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
