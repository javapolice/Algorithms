public class ThemePark {
    public static void main(String[] args) {

        long result = solution(3, 20, 4);

        System.out.println(result);
    }


    public static long solution(int price, int money, int count) {
        //변수 설정
        long needPrice = 0;
        long totalPrice = 0;

        //총요금 계산
        for (int i = 1; i <= count; i++) {
            totalPrice += (price * i);
        }

        //필요요금 구하기
        needPrice = (totalPrice - money);

        if (needPrice < 0) {
            needPrice = 0;
        }

        return needPrice;
    }
}
