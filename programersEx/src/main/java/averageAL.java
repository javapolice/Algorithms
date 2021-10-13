import java.util.ArrayList;
import java.util.List;

public class averageAL {
    public static void main(String[] args) {
        int[][] scores = {{90, 90, 90, 90}, {70, 70, 70, 70}, {90, 90, 90, 90}, {70, 70, 70, 70}};
        String result = solution(scores);
        System.out.println(result);
    }

    public static String solution(int[][] scores) {
        //변수선언
        StringBuilder grade = new StringBuilder();
        List<int[]> list = new ArrayList<>();

        //계산
        for(int i = 0; i < scores.length; i++){
            int[] temp = new int[scores.length];
            for(int j = 0; j < temp.length; j++){
                temp[j] = scores[j][i];
            }
            list.add(temp);
        }

        for(int i = 0; i < list.size(); i++){
            int[] temp = list.get(i);
            int max = -1;
            int min = 101;
            int Pcnt = 0;
            int Mcnt = 0;
            double sum = 0.0;
            double avg;

            for (int k : temp) {
                if (max <= k) {
                    max = k;
                }
                if (min >= k) {
                    min = k;
                }
                sum += k;
            }
            for (int j : temp) {
                if (max == j) {
                    Pcnt++;
                }
                if (min == j) {
                    Mcnt++;
                }
            }

            if((temp[i] == max && Pcnt == 1) || (temp[i] == min && Mcnt == 1)){
                sum -= temp[i];
                avg = sum/ (temp.length-1);
            }else{
                avg = sum/ (temp.length);
            }
            if(avg >= 90.0){
                grade.append("A");
            }else if(avg >= 80.0){
                grade.append("B");
            }else if(avg >= 70.0){
                grade.append("C");
            }else if(avg >= 50.0){
                grade.append("D");
            }else{
                grade.append("F");
            }
        }

        return grade.toString();
    }
}
