package CollectionFramework;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Lzf on 2018/9/30.
 */
/*泛型
JDK1.5以后出现的机制
是一种把类型明确的工作推迟到创建对象或者调用方法的时候才去明确的特殊的类型。
好处
提高了程序的安全性
把运行时期的问题提前到了编译期间
避免了强制类型转换*/
/*泛型的使用

我们使用泛型前，先来了解它的格式。
格式
<数据类型>
此处的数据类型只能是引用类型。
  泛型在哪些地方使用呢?
  看API，如果类，接口，抽象类后面跟的有< E >就说要使用泛型。一般来说就是在集合中使用。
  我们用泛型修改上面例子中的错误*/
public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList();
        al.add("hello");
        al.add("world");
        al.add("java");
//        al.add(1);//jdk5之后自动装箱
//        al.add(Integer.valueOf(1));等同上面
        Iterator<String> it = al.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }


}
