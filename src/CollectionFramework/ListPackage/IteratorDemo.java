package CollectionFramework.ListPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Lzf on 2018/9/28.
 */
/*迭代器Iterator——集合专用的遍历方式
Iterator接口概述
对 collection 进行迭代的迭代器
依赖于集合而存在
成员方法
boolean hasNext()
next()*/
public class IteratorDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        ((ArrayList) c).add("hello");
        ((ArrayList) c).add("world");
        ((ArrayList) c).add("java");
//       实际返回子类对象，多态
        Iterator it = c.iterator();
        while (it.hasNext()){
//            System.out.println(it.next());
            String s =(String)it.next();
            System.out.println(s);
        }

    }
}
