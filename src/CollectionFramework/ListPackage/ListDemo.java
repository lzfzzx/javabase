package CollectionFramework.ListPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Lzf on 2018/9/28.
 */
/*List接口
List接口概述
有序的 collection（也称为序列）。此接口的用户可以对列表中每个元素的插入位置进行精确地控制。
用户可以根据元素的整数索引（在列表中的位置）访问元素，并搜索列表中的元素。
与 set 不同，列表通常允许重复的元素。

所以我们可以看出List和Set的区别很明显
List接口：元素是有序的，元素可以重复，因为该集合体系有索引
Set接口：元素是无序，元素不可以重复，不能索引

下面我们来看List里面都有哪些成员方法
List接口成员方法
添加功能
void add(int index,Object element):在指定位置添加元素
获取功能
Object get(int index):获取指定位置的元素
删除功能
Object remove(int index)：根据索引删除元素,返回被删除的元素
修改功能
Object set(int index,Object element):根据索引修改元素，返回被修饰的元素
*/
public class ListDemo {
    public static void main(String[] args) {
//        创建集合对象
        List list = new ArrayList();
//        添加元素
        list.add("hello");
        list.add("world");
        list.add("java");
        System.out.println("原集合"+list);
//        指定位置添加元素
        list.add(1,"MKDLF");
        System.out.println("添加后"+list);
//        list.add(11,"aa");会出现IndexOutOfBoundsException下标越界异常
//        获取指定位置元素
        System.out.println("获取后"+list.get(1));
//        删除指定位置元素
        list.remove(1);
        System.out.println(list);
//        根据索引修改元素，返回被修改的元素
        list.set(2,"javaee");
        System.out.println(list);

//        通过for获取所有元素
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));

        }
//        通过迭代器获取所有元素
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }

}
