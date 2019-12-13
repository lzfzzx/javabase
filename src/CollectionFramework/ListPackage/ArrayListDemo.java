package CollectionFramework.ListPackage;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * Created by Lzf on 2018/9/28.
 */
/*List的三个子类
  List有三个子类对象
ArrayList类
Vector类
LinkedList类
  我们先来了解一下它们各自的特点，然后再来详细的了解它们
ArrayList:
底层数据结构是数组，查询快，增删慢。
线程不安全，效率高。
Vector:
底层数据结构是数组，查询快，增删慢。
线程安全，效率低。
LinkedList:
底层数据结构是链表，查询慢，增删快。
线程不安全，效率高。
那么List的这三个儿子，我们到底应该用那个呢？下面我们就来一一分析。
*/
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");
//        遍历
        Iterator it = arrayList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
/*ArrayList集合也可以存储自定义对象并遍历*/