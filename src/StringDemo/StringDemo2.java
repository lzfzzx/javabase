package StringDemo;

/**
 * Created by Lzf on 2018/9/25.
 */
/*String s = new String(“hello”)和String s = “hello”;的区别?(我们在下面举例说明)

//前者会创建2个对象，后者创建1个对象。我们可以用 == 和 equals来比较

//==:比较引用类型比较的是地址值是否相同
//equals:比较引用类型默认也是比较地址值是否相同，而String类重写了equals()方法，比较的是内容是否相同。

---------------------

*/
//public class StringDemo2 {
//    public static void main(String[] args) {
//        String s = new String("hello");
//        String s2 = "hello";
//        System.out.println(s==s2);
//        System.out.println(s.equals(s2));
//
//        String s3 = "hel"+new String("lo");
//        System.out.println(s3==s2);
//        System.out.println(s3.equals(s2));
//    }
//
//
//
//}
/*String类的判断功能
boolean equals(Object obj) ：比较字符串的内容是否相同,区分大小写
boolean equalsIgnoreCase(String str)：比较字符串的内容是否相同,忽略大小写
boolean contains(String str)：判断大字符串中是否包含小字符串
boolean startsWith(String str)：判断字符串是否以某个指定的字符串开头
boolean endsWith(String str)：判断字符串是否以某个指定的字符串结尾
boolean isEmpty()：判断字符串是否为空
注意：

字符串内容为空 和 字符串对象为空。
String s = “”;
String s = null;

*/
public class StringDemo2{
    public static void main(String[] args) {
        String s1 = "helloworld";
        String s2 = "helloworld";
        String s3 = "Helloworld";
//        equals区分大小写
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

//        equalsIgnoreCase不区分大小写
        System.out.println(s1.equalsIgnoreCase(s3));
//        boolean contains(String str):判断大字符串中是否包含小字符串
        System.out.println("contains:"+s1.contains("hel"));
        System.out.println("contains:"+s1.contains("abc"));

//        stratWith and endWith
        System.out.println("stratWith:"+s1.startsWith("hel"));
        System.out.println("stratWith:"+s1.startsWith("world"));
        System.out.println("endWith:"+s1.endsWith("hel"));
        System.out.println("endWith:"+s1.endsWith("world"));

//        isEmpty
        System.out.println(s1.isEmpty());//false
        String s4 = "";
        String s5 =null;
        System.out.println(s4.isEmpty());//true
        System.out.println(s5.isEmpty());//空指针异常，因为没有对象
    }
}