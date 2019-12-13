package CollectionFramework.SetPackage;

import java.util.TreeSet;

/**
 * Created by Lzf on 2018/9/30.
 */
/*TreeSet类
概述
使用元素的自然顺序对元素进行排序
或者根据创建 set 时提供的 Comparator 进行排序
所以排序有两种方式
自然排序
比较器排序
具体取决于使用的构造方法。*/
public class TreeSetDemo {
    public static void main(String[] args) {
//        创建集合对象
//        自然顺序进行排序
        TreeSet<Integer> ts = new TreeSet<Integer>();

//        添加元素
        ts.add(20);
        ts.add(23);
        ts.add(18);
        ts.add(27);
        ts.add(33);
        ts.add(18);
        ts.add(19);
        for (Integer i : ts){
            System.out.println(i);
        }
    }
}
/*TreeSet是如何保证元素的排序和唯一性的
底层数据结构是红黑树(红黑树是一种自平衡的二叉树)*/
