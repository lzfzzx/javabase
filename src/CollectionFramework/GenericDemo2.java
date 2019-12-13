package CollectionFramework;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

/**
 * Created by Lzf on 2018/9/30.
 */
/*泛型高级(通配符)
泛型通配符 < ?>
任意类型，如果没有明确，那么就是Object以及任意的Java类了
? extends E
向下限定，E及其子类
? super E
向上限定，E及其父类*/
public class GenericDemo2 {
    public static void main(String[] args) {
//        泛型如果明确写的话前后必须一致
        Collection<Object> c1 = new ArrayList<Object>();
        // Collection<Object> c2 = new ArrayList<Animal>();//报错
        // Collection<Object> c3 = new ArrayList<Dog>();//报错
        // Collection<Object> c4 = new ArrayList<Cat>();//报错
//        ？表示任意类型都可以
        Collection<?> c5 = new ArrayList<Object>();
        Collection<?> c6 = new ArrayList<Animal>();
// ? extends E:向下限定，E及其子类
//     Collection<? extends Animal> c7 = new ArrayList<Object>();//报错
        Collection<? extends Animal> c8 = new ArrayList<Cat>();
        // ? super E:向上限定，E极其父类
        Collection<? super Animal> c13 = new ArrayList<Object>();
        Collection<? super Animal> c14 = new ArrayList<Animal>();
        // Collection<? super Animal> c15 = new ArrayList<Dog>();//报错
        // Collection<? super Animal> c16 = new ArrayList<Cat>();//报错

    }
}
class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}
