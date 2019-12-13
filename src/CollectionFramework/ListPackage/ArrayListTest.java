package CollectionFramework.ListPackage;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Lzf on 2018/9/29.
 */
/*需求：ArrayList去除集合中字符串的重复值(字符串的内容相同)*/
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("hello");
        arrayList.add("hello");
        arrayList.add("hello");
        arrayList.add("hello");
        arrayList.add("hello");
        arrayList.add("hello");
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("world");
        arrayList.add("java");
        System.out.println(arrayList);
// 由选择排序思想引入，我们就可以通过这种思想做这个题目
        // 拿0索引的依次和后面的比较，有就把后的干掉
        // 同理，拿1索引...
        for (int i = 0; i <arrayList.size()-1 ; i++) {
            for (int j =i+1; j <arrayList.size() ; j++) {
                if (arrayList.get(i).equals(arrayList.get(j))){
                    arrayList.remove(j);
                    j--;
                }

            }

        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(arrayList);
//        Iterator it = arrayList.iterator();
//        while (it.hasNext()){
//            String s =(String)it.next();
//            if (!arrayList.contains(s)){
//                arrayList1.add(s);
//            }
//
//        }

    }
}
