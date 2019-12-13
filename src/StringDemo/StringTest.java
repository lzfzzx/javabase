package StringDemo;

/**
 * Created by Lzf on 2018/9/25.
 */
/*统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
*/
public class StringTest {
    public static void main(String[] args) {
        String s = "HelloWorld123" ;
        int bigcount = 0 ;
        int smallcount = 0;
        int count = 0;

        for (int i = 0; i <s.length() ; i++) {
            char chars =s.charAt(i);
           if (chars>='a'&&chars<='z'){
               smallcount++;
           }
           else if (chars>='A'&&chars<='Z'){
               bigcount++;
           }
           else if(chars>='0'&&chars<='9'){
               count++;
           }

        }
        System.out.println("大写："+bigcount);
        System.out.println("小写："+smallcount);
        System.out.println("数字："+count);
    }
}
