import java.util.HashMap;

public class Camouflage {
    public static void main(String[] args) {
        String[][] clothes = {{"yellowhat", "headgear"},{"bluesunglasses", "eyewear"},{"green_turban", "headgear"}};
        String[][] clothes2 = {{"crowmask", "face"},{"bluesunglasses", "face"},{"smoky_makeup", "face"}};
        System.out.println(solution(clothes));
        System.out.println(solution(clothes2));
    }

    public static int solution(String[][] clothes) {
        //변수선언
        int answer = 0;
        HashMap<String,Integer> dressCodeMap = new HashMap<>();
        int typeCnt = 0;
        //변수설정
        for(String[] s : clothes){
            dressCodeMap.put(s[1],dressCodeMap.getOrDefault(s[1],0)+1);
        }
        //계산


        //출력

        return answer;
    }
}
