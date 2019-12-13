package CollectionFramework.ListPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Lzf on 2018/9/28.
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
//        创建集合对象
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("java");
//        Iterator it =list.iterator();
//        while (it.hasNext()){
//            String s =(String)it.next();
//
//            if (s.equals("world")){
//                list.add("javaee");
//            }
//        }
//        System.out.println(list);
/*ConcurrentModificationException当方法检测到对象的并发修改，但不允许这种修改时，抛出此异常
* 产生的原因
迭代器是依赖于集合而存在的，在判断成功后，集合的中新添加了元素，而迭代器却不知道，所以就报错了，这个错叫并发修改异常。
其实这个问题描述的是：迭代器遍历元素的时候，通过集合是不能修改元素的。
如何解决呢？
迭代器迭代元素，迭代器修改元素
集合遍历元素，集合修改元素(普通for)
*/
//方法1：迭代器迭代元素，迭代器修改元素
//        而Iterator迭代器没有添加方法，所以使用其子类接口ListIterator
        ListIterator lit = list.listIterator();
        while(lit.hasNext()){
            String s = (String)lit.next();
            if (s.equals("world")){
                lit.add("javaee");

            }
//            此时并没有遍历刚添加的元素
            System.out.println(s);
        }

        System.out.println(list);
//方法2：普通for遍历
        for (int i = 0; i <list.size() ; i++) {
            String s =(String)list.get(i);
            if (s.equals("world")){
                list.add("fafafafafafa");
            }
//            此时遍历了刚添加的元素
            System.out.println(s);

        }
        System.out.println(list);
    }
}
//两种方法区别：
/*可以发现我们使用ListIterator迭代器后得到的结果（元素是跟在刚才迭代的元素后面的）
使用集合遍历元素后，集合修改元素得到的结果（元素在最后添加的）*/
