package BaseType;

import java.util.Calendar;

/**
 * Created by Lzf on 2018/9/28.
 */
/*Calendar类


Calendar类概述
Calendar 类是一个抽象类，它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等
日历字段之间的转换提供了一些方法，并为操作日历字段（例如获得下星期的日期）提供了一些方法。
成员方法
public static Calendar getInstance()  抽象类的构造方法不能实例化，成员方法提供实例化方法
public int get(int field)：返回给定日历字段的值。日历类中的每个日历字段都是静态的成员变量，并且是int类型。
public void add(int field,int amount)：根据给定的日历字段和对应的时间，来对当前的日历进行操作。
public final void set(int year,int month,int date):设置当前日历的年月日
*/
public class CalendarDemo {
    public static void main(String[] args) {
//        其字段日期已由当前日期和时间初始化
        Calendar now =Calendar.getInstance();
//        获取年
        int year =now.get(Calendar.YEAR);
//        获取月
        int month=now.get(Calendar.MONTH);
//        获取日
        int day = now.get(Calendar.DATE);
        System.out.println(year+"年"+(month+1)+"月"+day+"日");
        Calendar now2 = Calendar.getInstance();
        now2.add(Calendar.YEAR,5);
        year = now2.get(Calendar.YEAR);
        System.out.println(year);
    }
}
/*MONTH加1的原因：
public static final int MONTH 指示月份的 get 和 set 的字段数字。这是一个特定于日历的值。
在格里高利历和罗马儒略历中一年中的第一个月是 JANUARY，它为 0；最后一个月取决于一年中的月份数。
简单来说，因为这个值的初始值是0，因此我们要用它来表示正确的月份时就需要加1。
WEEK减1的原因：
public static final int DAY_OF_WEEK get 和 set 的字段数字，指示一个星期中的某天。
该字段可取的值为 SUNDAY、MONDAY、TUESDAY、WEDNESDAY、THURSDAY、FRIDAY 和 SATURDAY 观察代码，
你会发现其实week是用来确定随后的字符串week1该如何截取的，我们知道DAY_OF_WEEK是获取当前日期是一周中的第几天，
而一周从周日算起，因此当我们取得这个值之后，为了要正确的截取出随后的字符串week1中的那个中文字符，
因此它需要减1来达到目的。你只要跟踪一下程序运行，观察变量的赋值就会理解它这样编写的用意了。
定义day时不用的原因：
public static final int DATE get 和 set 的字段数字，指示一个月中的某天。
它与 DAY_OF_MONTH 是同义词。一个月中第一天的值为 1。 根据定义我们可以知道，这个值取得后不需要做任何变更就是程序需要的值。
substring(week, week+1)：
public String substring(int beginIndex, int endIndex) 返回一个新字符串，它是此字符串的一个子字符串。
该子字符串从指定的 beginIndex 处开始，直到索引 endIndex - 1 处的字符。因此，该子字符串的长度为 endIndex-beginIndex。
根据定义，我们就知道这个方法的用途了。举例来说，假如今天是星期四，那么之前获得的week的值就是4，
因为我们取到了DAY_OF_WEEK（这里是5）后又减了1，然后我们用这个变量week来帮助我们截取字符串week1,
这里调用了substring(4,5),所以取到的字符就是“四，正是我们需要的字符。
*/