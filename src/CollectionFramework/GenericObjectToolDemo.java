package CollectionFramework;

/**
 * Created by Lzf on 2018/9/30.
 */
/*泛型类


把泛型定义在类上
格式:public class 类名<泛型类型1,…>
注意:泛型类型必须是引用类型
  早期的时候，我们使用Object来代表任意的类型。
  向上转型是没有任何问题的，但是在向下转型的时候其实隐含了类型转换的问题。
  也就是说这样的程序其实并不是安全的。所以Java在JDK5后引入了泛型，提高程序的安全性。
  下面我们就来学习泛型类是怎么回事
*/
public class GenericObjectToolDemo {
    public static void main(String[] args) {
        ObjectTool<String> ot = new ObjectTool<String>();
        ot.setObj("李宗伟");
        String s =ot.getObj();
        System.out.println(s);

        ObjectTool<Integer> ot2 = new ObjectTool<Integer>();
        ot2.setObj(24);
        Integer i = ot2.getObj();
        System.out.println(i);
    }
}
class ObjectTool<T>{
    private  T obj;

    public void setObj(T obj) {
        this.obj = obj;
    }

    public T getObj(){
        return  obj;
    }
}
