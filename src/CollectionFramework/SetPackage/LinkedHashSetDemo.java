package CollectionFramework.SetPackage;

import java.util.LinkedHashSet;

/**
 * Created by Lzf on 2018/9/30.
 */
/*LinkedHashSet类
概述
底层数据结构由哈希表和链表组成
由链表保证元素有序(存储和取出是一致)
由哈希表保证元素唯一性 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> hs = new LinkedHashSet<String>();
//        创建并添加元素
        hs.add("hello");
        hs.add("world");
        hs.add("java");
        hs.add("hello");
        hs.add("world");

//        遍历
        for (String s : hs){
            System.out.println(s);
        }
    }
}
