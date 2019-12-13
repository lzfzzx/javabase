///**
// * Created by Lzf on 2018/9/20.
// */
//public class Test {
//    public static void main(String[] args) {
//        Father2 father2 = new Father2();
//
//
//    }
//
//
//
//}
//class Father1{
//    private int a =10 ;
//    int b =20;
//    public Father1(){
//
//    }
//    public void show(){
//
//    }
//
//
//}
//class Father2 extends Father1{
//
//    public Father2(){
//        super();
//        super.b = 30;
//    }
//
//}

import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Test {
    //    public static void main(String[] args) {
//        String a = "asfs";
//        for (int i = 0; i <a.length() ; i++) {
//            char b = a.charAt(i);
//            if (b == 'a') {
//                continue;
//            }else {
//                System.out.println("RRR");
//            }
//        }
//    }
    public static void main(String[] args) throws ParseException {
//        String string = "2011-05-09";
//        String string1 = " 00:00:00.01";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-DD");
//        Date date = simpleDateFormat.parse(string);
//        Timestamp ts = new Timestamp(date.getTime());
//        System.out.println(ts);
////        String s2 = string + string1;
////        Timestamp ts = Timestamp.valueOf(s2);
////        System.out.println(ts);
//        Date date1 = new Date();
//        Instant instant = date1.toInstant();
//        ZoneId zoneId = ZoneId.systemDefault();
//        LocalDateTime localDateTime = instant.atZone(zoneId).toLocalDateTime();
//        simpleDateFormat.format(date1);
//        System.out.println("date"+date1);
//        System.out.println("localdatetime:"+localDateTime);
//        String s = "2019-02-16 00:00:01";
//        System.out.println("str:" + s);
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
//        Date d = simpleDateFormat.parse(s);
//        Date d3 = simpleDateFormat1.parse(s);
//        java.sql.Date d2 = new java.sql.Date(d.getTime());
//        System.out.println(d2);
//
////
//        Instant instant = d.toInstant();
//        ZoneId zone = ZoneId.systemDefault();
//        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
//        System.out.println(localDateTime);

//        String i = "1";
//        String j = "";
//        if ((i == null && i=="") || (j == null && j=="")) {
//            System.out.println("hahaha");
//        }else{
//            System.out.println("NO");
//        }


//        String dir = "Z:\\Output\\manual-tickets\\finished";
//        TestFile testFile = new TestFile();
//        System.out.println(testFile.getFileNames(dir));

//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date date2 = new Date();
//        dateFormat.format(date2);
////        Date date = dateFormat.parse(str);
//        java.sql.Date date1 = new java.sql.Date(date2.getTime());
//        System.out.println(date1);
//        Time time = new Time(10000);
//        System.out.println(time);

//        String a = "abcdefg";
////        System.out.println(a.substring(0,3));
        DateFormat format = new SimpleDateFormat("yyyy-MM-DD'T'HH:mm:ss");
        String s = "2019-01-25T18:22:58";
        String s2 = "2019-01-25T00:00:00";
        String s3 = s.substring(11);
        String s4 = s.substring(0, 10);
        long d = format.parse(s).getTime();
        long d2 = format.parse(s2).getTime();
//        System.out.println(d2);
        long d3 = d -d2 ;
        Time time =Time.valueOf(s3);
        System.out.println(time);
        System.out.println(s4);




    }



}
