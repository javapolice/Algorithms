package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Time {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int hour = 0; hour <= time; hour++){
            for(int min = 0; min < 60; min++){
                for(int sec = 0; sec < 60; sec++){
                    String T = String.valueOf(hour) + String.valueOf(min) + String.valueOf(sec);
                    if(T.contains("3")){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
