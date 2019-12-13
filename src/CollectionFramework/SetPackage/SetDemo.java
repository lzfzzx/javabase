package CollectionFramework.SetPackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Lzf on 2018/9/30.
 */
/*Set
元素是无序(存储顺序和取出顺序不一致),元素是唯一的，不可重复的*/
public class SetDemo {
    public static void main(String[] args) {
//        创建集合对象
        Set<String> set = new HashSet<String>();
//        添加元素
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("java");
        set.add("hello");

//        增强for遍历
        /*格式：
    for(元素数据类型 变量 : 数组或者Collection集合) {
        使用变量即可，该变量就是元素
    }
    好处：简化了数组和集合的遍历。
    弊端： 增强for的目标不能为null。
如何解决呢?对增强for的目标先进行不为null的判断，然后在使用。*/
        for(String s :set){
            System.out.println(s);
        }
        System.out.println("_______________");
//        迭代器遍历
        Iterator it =set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
