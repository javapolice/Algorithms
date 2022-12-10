import java.util.HashMap;

public class Marathon {
    public static void main(String[] args) {
        Marathon marathon = new Marathon();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        String[] participant2 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion2 = {"stanko", "ana", "mislav"};
        String answer = marathon.solution(participant,completion);
        String answer2 = marathon.solution(participant2,completion2);

        System.out.println(answer);
        System.out.println(answer2);
    }
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for(String s : participant){
            map.put(s, map.getOrDefault(s,0)+1);
        }
        for(String s : completion){
            map.put(s,map.get(s)-1);
        }
        for(String s : map.keySet()){
            if(map.get(s) != 0){
                answer = s;
                break;
            }
        }
        return answer;
    }
}
