package BaseType;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Lzf on 2018/9/28.
 */
/*DateFormat类


DateFormat类概述
DateFormat 是日期/时间格式化子类的抽象类，它以与语言无关的方式格式化并解析日期或时间。
是抽象类，所以使用其子类SimpleDateFormat
SimpleDateFormat构造方法
public SimpleDateFormat():默认模式
public SimpleDateFormat(String pattern):给定的模式
年 y
月 M
日 d
时 H
分 m
秒 s
所以一般我们要这样书写”yyyy年MM月dd日 HH:mm:ss”
就会得到相应的日期：比如 2016年08月17日 23:05:16

成员方法
public final String format(Date date)：Date – String(格式化)
public Date parse(String source)：String – Date(解析)
*/
public class DateFormatDemo {
    public static void main(String[] args) throws ParseException {
//        构造方法
        SimpleDateFormat sdf = new SimpleDateFormat();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");//给定模式
        Date date = new Date();
//        Date - String(格式化)
        String s = sdf1.format(date);
        System.out.println(s);
//        String - Date(解析)
        String s1 ="2016-08-08 12:12:12";
        //在把一个字符串解析为日期的时候，请注意格式必须和给定的字符串格式匹配
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        Date date1 = sdf2.parse(s1);
        System.out.println(date1);

    }
}
