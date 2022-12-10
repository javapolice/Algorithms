import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Algorithm {
    public static String solution(String[] participant, String[] completion) {
        HashMap<Integer,String> partiMap = new HashMap<>();
        HashMap<Integer,String> compMap = new HashMap<>();
        int partiMapSize = participant.length;
        int compMapSize = completion.length;
        for(int i = 0; i < partiMapSize; i++){
            partiMap.put(i,participant[i]);
        }
        for (int i = 0; i < compMapSize; i++){
            compMap.put(i,completion[i]);
        }
        for(int i = 0; i < partiMapSize; i++){
            for(int j =0; j < compMapSize; j++){
                if(partiMap.get(i) == compMap.get(j)){
                    partiMap.remove(i);
                    compMap.remove(j);
                    break;
                }
            }
        }
        String answer = partiMap.values().toString().replace("[","").replace("]","");
        return answer;
    }
    public static void main(String[] args) {
         String[] participant = {"mislav", "stanko", "mislav", "ana"};
         String[] completion = {"stanko", "ana", "mislav"};
         System.out.println(solution(participant, completion));
    }
}
