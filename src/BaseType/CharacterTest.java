package BaseType;

/**
 * Created by Lzf on 2018/9/26.
 */

//统计一个字符串中大写、小写字符及数字字符出现的个数
public class CharacterTest {
    public static void main(String[] args) {
        String string = "Abc123Messi";
        char [] chars =string.toCharArray();
        int upperCaseCount = 0 ;
        int lowerCaseCount = 0;
        int numberCount = 0;

        for (int i = 0; i <chars.length ; i++) {
            if (Character.isUpperCase(chars[i])){
                upperCaseCount++;
            }
            else if (Character.isLowerCase(chars[i])){
                lowerCaseCount++;
            }
            else if (Character.isDigit(chars[i])){
                numberCount++;
            }
        }
        System.out.println("大写："+upperCaseCount);
        System.out.println("小写："+lowerCaseCount);
        System.out.println("数字："+numberCount);
    }
}
