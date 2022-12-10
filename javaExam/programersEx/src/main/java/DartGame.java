import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DartGame {
    public static int solution(String dartResult) {
        int answer_arr[] = new int[3];
        int idx = 0;
        int intCnt = 0;
        for(int i = 0; i < dartResult.length(); i++){
           char c = dartResult.charAt(i);
           int num = Character.getNumericValue(c);

           if(num >= 0 && num <= 10){
               if(num == 1){
                   if(Character.getNumericValue(dartResult.charAt(i+1)) == 0){
                       num = 10;
                       i++;
                   }
               }
               answer_arr[idx] = num;
               intCnt++;
           }else{
               switch (c){
                   case 'S' :
                       answer_arr[idx] = (int)Math.pow(answer_arr[idx], 1);
                       idx++;
                       break;
                   case 'D' :
                       answer_arr[idx] = (int)Math.pow(answer_arr[idx], 2);
                       idx++;
                       break;
                   case 'T' :
                       answer_arr[idx] = (int)Math.pow(answer_arr[idx], 3);
                       idx++;
                       break;
                   case '*' :
                       idx = idx - 2 < 0 ? 0 : idx - 2;
                       while(idx < intCnt){
                           answer_arr[idx] = answer_arr[idx] * 2;
                           idx++;
                       }
                       break;
                   case '#' :
                       answer_arr[idx-1] = answer_arr[idx-1] * (-1);
                       break;
               }
           }
        }

        return answer_arr[0] + answer_arr[1] + answer_arr[2];
    }

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("./src/main/resources/file.txt");
        BufferedReader br = new BufferedReader(fr);
        String s;
        while(br.ready()){
            s = br.readLine();
            System.out.println(solution(s));
        }
    }
}
