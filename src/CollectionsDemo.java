import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Lzf on 2018/10/8.
 */
/*Collections类概述
针对集合进行操作的工具类，都是静态方法。
Collection和Collections的区别
Collection:是单列集合的顶层接口，有子接口List和Set。
Collections:是针对集合操作的工具类，有对集合进行排序和二分查找的方法
Collections成员方法
public static < T> void sort(List list)：排序 默认情况下是自然顺序。
public static < T> int binarySearch(List< ?> list,T key):二分查找
public static < T> T max(Collection< ?> coll):最大值
public static void reverse(List< ?> list):反转
public static void shuffle(List< ?> list):随机置换
*/
public class CollectionsDemo {
    public static void main(String[] args) {
        // 创建集合对象
        List<Integer> list = new ArrayList<Integer>();

        // 添加元素
        list.add(30);
        list.add(20);
        list.add(50);
        list.add(10);
        list.add(40);

        System.out.println("list:" + list);

        // public static <T> void sort(List<T> list)：排序 默认情况下是自然顺序。
        Collections.sort(list);
        System.out.println("自然顺序list:" + list);

        // public static <T> int binarySearch(List<?> list,T key):二分查找
        System.out.println("二分查找:" + Collections.binarySearch(list, 30));
        System.out.println("二分查找:"+ Collections.binarySearch(list, 300));

        // public static <T> T max(Collection<?> coll):最大值
        System.out.println("max:"+Collections.max(list));

        // public static void reverse(List<?> list):反转
        Collections.reverse(list);
        System.out.println("list:" + list);

        //public static void shuffle(List<?> list):随机置换
        Collections.shuffle(list);
        System.out.println("list:" + list);
    }

}
/*看到结果是不是二分查找不存在的时候返回-6为什么呢。
因为当二分查找不存在的时候，它就会返回最大索引+1再+1.*/