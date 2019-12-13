package StringDemo;

/**
 * Created by Lzf on 2018/9/25.
 */
/*String类的其他功能
替换功能：
String replace(char old,char new)
String replace(String old,String new)
去除字符串两空格
String trim()
按字典顺序比较两个字符串
int compareTo(String str)
int compareToIgnoreCase(String str)

*/
public class StringDemo5 {
    public static void main(String[] args) {
//        替换
        String s1 = "helloworld";
        System.out.println(s1.replace('l','k'));
        System.out.println(s1.replace("owo","qwq"));
//       去除字符串量空格
        String s2 = " Hello World ";
        System.out.println("-----"+s2.trim()+"----");
// 按字典顺序比较两个字符串
        String s6 = "hello";
        String s7 = "hello";
        String s8 = "abc";
        String s9 = "xyz";
        System.out.println(s6.compareTo(s7));// 0
        System.out.println(s6.compareTo(s8));// 7
        System.out.println(s6.compareTo(s9));// -16

    }



}
