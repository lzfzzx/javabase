package BaseType;

/**
 * Created by Lzf on 2018/9/26.
 */
/*Character类概述
Character 类在对象中包装一个基本类型 char 的值，此外，该类提供了几种方法，以确定字符的类别（小写字母，数字，等等），
并将字符从大写转换成小写，反之亦然

构造方法
public Character(char value)*/
//public class CharacterDemo {
//    public static void main(String[] args) {
//        Character ch = new Character('a');
//        System.out.println(ch);
//    }
//}

/*Character类成员方法
public static boolean isUpperCase(char ch):判断给定的字符是否是大写字符
public static boolean isLowerCase(char ch):判断给定的字符是否是小写字符
public static boolean isDigit(char ch):判断给定的字符是否是数字字符
public static char toUpperCase(char ch):把给定的字符转换为大写字符
public static char toLowerCase(char ch):把给定的字符转换为小写字符
*/
public class CharacterDemo{
    public static void main(String[] args) {
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('B'));
    }
}