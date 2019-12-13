package BaseType;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by Lzf on 2018/9/28.
 */
/*Date类
Date类概述
类 Date 表示特定的瞬间，精确到毫秒。
构造方法
public Date():根据当前的默认毫秒值创建日期对象
public Date(long date)：根据给定的毫秒值创建日期对象*/
public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        long time = 1000*60*60;//1小时
        Date date1 = new Date(time);
        System.out.println(date1);
/*成员方法
public long getTime():获取时间，以毫秒为单位（从Date得到一个毫秒值）
public void setTime(long time):设置时间（把一个毫秒值转换为Date）*/
        Date date2 = new Date();
//        long time1 = date2.getTime();
//        System.out.println(time1);
//        System.out.println(System.currentTimeMillis());
//        long time2 = System.currentTimeMillis();
//        date2.setTime(time2);
//        System.out.println(date2);
//        Date date3 = new Date();

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);
    }
}
