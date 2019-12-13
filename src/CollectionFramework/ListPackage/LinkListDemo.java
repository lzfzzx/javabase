package CollectionFramework.ListPackage;

import java.util.LinkedList;

/**
 * Created by Lzf on 2018/9/30.
 */
public class LinkListDemo {
    public static void main(String[] args) {

        MyStack ms =new MyStack();
        ms.add("hello");
        ms.add("world");
        ms.add("java");

        while (!ms.isEmpty()){
            System.out.println(ms.get());
        }

    }
}
/*自定义栈集合*/
class MyStack{
    private LinkedList link;
    public MyStack(){
        link = new LinkedList();
    }
    public void add(Object obj){
        link.addFirst(obj);
    }
    public Object get(){
        return link.removeFirst();
    }
    public boolean isEmpty(){
        return link.isEmpty();
    }
}
/*使用LinkedList模拟一个堆栈或者队列数据模式 堆栈：先进后出 队列：先进先出*/
