package CollectionFramework.ListPackage;

import java.util.LinkedList;

/**
 * Created by Lzf on 2018/9/29.
 */
/*LinkedList类的使用
在LinkedList类中，它也有自己特有的功能，下面我们来了解
添加功能
public void addFirst(Object e)
public void addLast(Object e)
获取功能
public Object getFirst()
public Obejct getLast()
删除功能
public Object removeFirst()
public Object removeLast()
我们发现上面的添加获取删除功能它们都有一个xxFirst和xxLast方法，这就是第一个和最后一个的意思啦，当然使用起来也很方便的。
*/
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.add("hello");
        link.add("world");
        link.add("java");
        link.addFirst("abc");
        link.addLast("def");
        System.out.println(link);
        link.removeFirst();
        link.removeLast();
        System.out.println(link);
        System.out.println(link.getFirst());
        System.out.println(link.getLast());
    }

}
