import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) throws ParseException {
        String penalty = "";
        String checkInDate = "20210610" + "18";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHH");
        Date nowDate = new Date();
        Date arrvDate = sdf.parse(checkInDate);

        Long diff = (arrvDate.getTime() - nowDate.getTime()) / (24 * 60 * 60 * 1000);

        System.out.println(arrvDate);
        System.out.println(nowDate);
        System.out.println(diff);
    }
}
