package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Lzf on 2018/9/28.
 */
/*集合框架


集合类的由来
面向对象语言对事物的体现都是以对象的形式，所以为了方便对多个对象的操作，Java就提供了集合类。
数组和集合类同是容器，他们有何区别
数组虽然也可以存储对象，但长度是固定的。数组中可以存储基本数据类型。
集合长度是可变的。集合只能存储对象。
集合类的特点
集合只用于存储对象，集合长度是可变的，集合可以存储不同类型的对象。
*/

/*
Collection接口|—Set接口——HashSet类
              |          |—LinkedHashSet类
              |          |—SortedSet接口—TreeSet类
              |
             |—List接口——LinkedList类
                         |—Vector类
                         |—ArrayList类

* */
/*Collection接口


概述（通过查看API）
Collection 层次结构中的根接口。Collection 表示一组对象，这些对象也称为 collection 的元素。一些 collection 允许有重复的元素，而另一些则不允许。
一些 collection 是有序的，而另一些则是无序的。
Collection的功能概述：
1：添加功能
boolean add(Object obj):添加一个元素
boolean addAll(Collection c):添加一个集合的元素
2:删除功能
void clear():移除所有元素
boolean remove(Object o):移除一个元素
boolean removeAll(Collection c):移除一个集合的元素
3:判断功能
boolean contains(Object o)：判断集合中是否包含指定的元素
boolean containsAll(Collection c)：判断集合中是否包含指定的集合元素
boolean isEmpty()：判断集合是否为空
4:获取功能
Iterator iterator()
5:长度功能
int size():元素的个数
6:交集功能
boolean retainAll(Collection c)
7：把集合转换为数组
Object[] toArray()
*/
public class CollectionDemo {
    public static void main(String[] args) {
//        测试不带All方法
//        创建集合对象
        Collection c = new ArrayList();
//        添加元素
        ((ArrayList) c).add("hello");
        ((ArrayList) c).add("World");
        ((ArrayList) c).add("java");
//        判断集合是否为空
        System.out.println(c.isEmpty());
//        元素个数
        System.out.println(c.size());
        System.out.println(c);
//        c.clear();
//        System.out.println(c);
//        移除
        System.out.println(c.remove("hello"));
        System.out.println(c);
        System.out.println(c.remove("javaee"));
//        判断是否包含
        System.out.println(c.contains("hello"));

//        两个集合的交集
        Collection c1 = new ArrayList();
        ((ArrayList) c1).add("a1");
        ((ArrayList) c1).add("a2");

        Collection c2 = new ArrayList();
        ((ArrayList) c2).add("a1");
        ((ArrayList) c2).add("a2");
        ((ArrayList) c2).add("a3");
        ((ArrayList) c2).add("a4");

//        c1.retainAll(c2);
//        System.out.println(c1);
//        求c2中与c1的交集
        c2.retainAll(c1);
        System.out.println(c2);
//        集合转数组遍历
        Object[]objects = c.toArray();
        for (int i = 0; i <objects.length ; i++) {
            String s =(String)objects[i];
            System.out.println(s+"______"+s.length());
        }

    }

}
