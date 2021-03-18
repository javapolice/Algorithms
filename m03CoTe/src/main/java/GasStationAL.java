import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class GasStationAL {
    public static void main(String[] args) throws IOException {
        //값 추출
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cityCnt = Integer.parseInt(st.nextToken());
        Long[] roadLength = new Long[cityCnt - 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < roadLength.length; i++) {
            roadLength[i] = Long.parseLong(st.nextToken());
        }
        List<Long> gasPrice = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cityCnt; i++) {
            gasPrice.add(Long.parseLong(st.nextToken()));
        }

        //계산
        int nowCity = 0;
        int nextCity = nowCity + 1;
        long result = gasPrice.get(nowCity) * roadLength[nowCity];

        while(nextCity < cityCnt-1){
            if(gasPrice.get(nowCity) < gasPrice.get(nextCity)){
                result += gasPrice.get(nowCity) * roadLength[nextCity];
            }else{
                result += gasPrice.get(nextCity) * roadLength[nextCity];
                nowCity = nextCity;
            }
            nextCity++;
        }
        System.out.println(result);
    }
}
