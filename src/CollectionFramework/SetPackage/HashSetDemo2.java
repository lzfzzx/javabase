package CollectionFramework.SetPackage;

import java.util.HashSet;

/**
 * Created by Lzf on 2018/9/30.
 */
public class HashSetDemo2 {
    public static void main(String[] args) {
//        创建集合对象
        HashSet<Student> hs = new HashSet<Student>();
//        创建学生对象
        Student s1 = new Student("奥特曼",22);
        Student s2 = new Student("怪兽",23);
        Student s3 = new Student("怪兽",24);
        Student s4 = new Student("人类",24);
        Student s5 = new Student("人类",24);
//        添加元素
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        hs.add(s5);
        for(Student s : hs){
            System.out.println(s.getName()+"______"+s.getAge());
        }
    }
}
/*我们看输出结果，很明显不符合我的要求。
  因为我们知道HashSet底层依赖的是hashCode()和equals()方法。
  而这两个方法我们在学生类中没有重写，所以，默认使用的是Object类。
  这个时候，他们的哈希值是不会一样的，根本就不会继续判断，执行了添加操作
*/