package StringBuffer;

/**
 * Created by Lzf on 2018/9/25.
 */

/*StringBuffer类的成员方法
添加功能
public StringBuffer append(String str)：可以把任意类型数据添加到字符串缓冲区里面,并返回字符串缓冲区本身
public StringBuffer insert(int offset,String str)：在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身
删除功能
public StringBuffer deleteCharAt(int index)：删除指定位置的字符，并返回本身
public StringBuffer delete(int start,int end)：删除从指定位置开始指定位置结束的内容，并返回本身
替换功能
public StringBuffer replace(int start,int end,String str)：从start开始到end用str替换
反转功能
public StringBuffer reverse()
截取功能
public String substring(int start)
public String substring(int start,int end)
*/


public class StringBufferDemo1 {
    public static void main(String[] args) {
        char[]a ={'a','b','c'};
//        创建字符串缓冲区对象
        StringBuffer stringBuffer =new StringBuffer();
//        添加数据
        stringBuffer.append("abc");
        stringBuffer.append(true);
        stringBuffer.append(123);
        stringBuffer.append(1.1);
        stringBuffer.append(a);
        stringBuffer.append("def");
        System.out.println(stringBuffer);
//        指定位置把任意类型字符串插入到字符串缓冲区，并返回字符串缓冲区本身
        stringBuffer.insert(0,"def");
        System.out.println(stringBuffer);
//        删除某个位置字符
        stringBuffer.deleteCharAt(1);
        System.out.println(stringBuffer);
//        删除指定一段的字符串
        stringBuffer.delete(0,2);
        System.out.println(stringBuffer);
//        删除所有数据
//        stringBuffer.delete(0,stringBuffer.length());
//        System.out.println("删除所有字符串："+stringBuffer);

//        替换
        stringBuffer.replace(0,3,"function");
        System.out.println(stringBuffer);

//        反转
        stringBuffer.reverse();
        System.out.println(stringBuffer);

//        截取
        System.out.println(stringBuffer.substring(5));
        System.out.println(stringBuffer.substring(0,5));

    }
}
