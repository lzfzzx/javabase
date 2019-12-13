package BaseType;

import javax.sound.midi.Soundbank;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Lzf on 2018/9/28.
 */
/*计算你来到世界多少天*/
public class DateFormatTest {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你出生的年月日(YYYY-MM-DD)");
        String s = scanner.nextLine();
//        字符串转换为日期
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
        Date d = sdf.parse(s);
//        通过该日期获取毫秒值
        long time = d.getTime();
//        获取系统当前时间毫秒值再减去time
        long time1 =System.currentTimeMillis()-time;
//        计算天数
        long day = time1/1000/60/60/24;
        System.out.println("你来到世界:"+day+"天");

    }
}
