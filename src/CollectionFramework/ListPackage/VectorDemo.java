package CollectionFramework.ListPackage;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Lzf on 2018/9/28.
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("hello");
        vector.add("world");
        vector.add("java");
//        遍历,相当于迭代器
        Enumeration en = vector.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }

}
