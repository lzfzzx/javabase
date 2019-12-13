package MapDemos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Lzf on 2018/10/8.
 */
/*
Map接口————HashMap类
            |—LinkedHashMap类
           |—HashTable类
           |—SortedMap接口——TreeMap类
* */
/*Map集合
概述
将键映射到值的对象
一个映射不能包含重复的键
每个键最多只能映射到一个值
  前面我们一直在学Collection集合，那么它和Map集合有什么区别呢？
Map集合存储元素是成对出现的，Map集合的键是唯一的，值是可重复的。可以把这个理解为：夫妻对
Collection集合存储元素是单独出现的，Collection的儿子Set是唯一的，List是可重复的。可以把这个理解为：光棍
注意：
Map集合的数据结构值针对键有效，跟值无关
Collection集合的数据结构是针对元素有效
下面我们来了解Map集合的功能概述
添加功能
V put(K key,V value):添加元素。
*/
public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        System.out.println(map.put(1,"GG"));
        System.out.println(map.put(1,"MM"));
        /*因为如果键是第一次存储，就直接存储元素，返回null
如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值*/
        map.put(2,"GG");
        map.put(3,"DD");
        map.put(4,"DD");
        System.out.println(map);

        /*删除功能
void clear():移除所有的键值对元素
V remove(Object key)：根据键删除键值对元素，并把值返回*/
        map.remove(4);
        System.out.println(map);
//        map.clear();
//        System.out.println(map);

        /*判断功能
boolean containsKey(Object key)：判断集合是否包含指定的键
boolean containsValue(Object value):判断集合是否包含指定的值
boolean isEmpty()：判断集合是否为空*/
        System.out.println("containsKey:"+map.containsKey(1));
        System.out.println("containsKey:"+map.containsKey(4));
        System.out.println("containsValue:"+map.containsValue("GG"));
        System.out.println("containsValue:"+map.containsValue("GGG"));
        System.out.println("isEmpty:"+map.isEmpty());

        /*长度功能
int size()：返回集合中的键值对的对数*/
        System.out.println("size:"+map.size());

        /*获取功能
V get(Object key):根据键获取值
Set keySet():获取集合中所有键的集合
Collection values():获取集合中所有值的集合
Set< Map.Entry< K,V>> entrySet()：返回的是键值对对象的集合*/
//       V get(Object key):根据键获取值
        System.out.println("get:"+map.get(1));
        System.out.println("get:"+map.get(4));
//        Set keySet():获取集合中所有键的集合
        Set<Integer> set = map.keySet();
        for(Integer i : set){
            System.out.println(i);
        }
//      Collection values():获取集合中所有值的集合
        Collection<String> con = map.values();
        for (String s : con){
            System.out.println(s);
        }
//        获取所有键值对对象的集合
        Set<Map.Entry<Integer,String>>set1 = map.entrySet();
//        遍历键值对对象的集合，得到每个键值对对象
        for (Map.Entry<Integer,String> me : set1){
//            System.out.println(me);
            int key = me.getKey();
            String value = me.getValue();
            System.out.println(key+"_________"+value);
        }


    }
}


/*Map子类
HashMap
HashMap类概述
键是哈希表结构，可以保证键的唯一性
常用案例
HashMap< String,String>
HashMap< Integer,String>
HashMap< String,Student>
HashMap< Student,String>
上面的也不是非要是学生对象，可以是你需求的对象

LinkedHashMap
概述
Map 接口的哈希表和链接列表实现，具有可预知的迭代顺序。
由哈希表保证键的唯一性，不可重复
由链表保证键盘的有序(存储和取出的顺序一致)

TreeMap
概述
键是红黑树结构，可以保证键的排序和唯一性
*/