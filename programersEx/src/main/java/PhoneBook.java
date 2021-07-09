import java.util.HashSet;

public class PhoneBook {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        String[] phone_book2 = {"123","456","789"};
        String[] phone_book3 = {"12","123","1235","567","88"};

        System.out.println(solution(phone_book));
        System.out.println(solution(phone_book2));
        System.out.println(solution(phone_book3));

    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        HashSet<String> hashSet = new HashSet<>();
        for(String s : phone_book){
            hashSet.add(s);
        }
        for(int i =0; i < phone_book.length; i++){
            String prefix = phone_book[i];
            for(int j = 1; j < prefix.length(); j++){
                if(hashSet.contains(prefix.substring(0,j))){
                    answer=false;
                    return answer;
                }
            }
        }
        return answer;
    }
}
