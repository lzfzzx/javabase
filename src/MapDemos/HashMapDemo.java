package MapDemos;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by Lzf on 2018/10/8.
 */
/*HashMap与HashTable区别*/
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<String,String>();
        hm.put("hello","world");
        hm.put(null,"hehe");
        hm.put("hehe",null);
        System.out.println(hm);

        Hashtable<String,String> ht = new Hashtable<String, String>();
        ht.put("hello","world");
//        ht.put(null,"hehe");//空指针
//        ht.put("hehe",null);//空指针
        System.out.println(ht);
    }
}
/*HashMap:线程不安全，效率高。允许null键和null值
Hashtable:线程安全，效率低。不允许null键和null值*/