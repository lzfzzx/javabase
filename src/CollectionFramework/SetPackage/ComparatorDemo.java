package CollectionFramework.SetPackage;

import java.util.TreeSet;

/**
 * Created by Lzf on 2018/9/30.
 */
public class ComparatorDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>();
        Student s1 =new Student("奥特曼",22);
        Student s2 =new Student("怪兽",23);
        Student s3 =new Student("葫芦娃",26);
        Student s4 =new Student("葫芦娃",27);
        Student s5 =new Student("机器猫",10);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for (Student s : ts){
            System.out.println(s.getName()+"_________"+s.getAge());
        }
    }
}

/*TreeSet集合保证元素排序和唯一性的原理
唯一性：是根据比较的返回是否是0来决定。
排序：
A:自然排序(元素具备比较性)
让元素所属的类实现自然排序接口 Comparable
B:比较器排序(集合具备比较性)
让集合的构造方法接收一个比较器接口的子类对象 Comparator
*/