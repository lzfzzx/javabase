package CollectionFramework;

/**
 * Created by Lzf on 2018/9/30.
 */
/*泛型方法
把泛型定义在方法上
格式:public <泛型类型> 返回类型 方法名(泛型类型 .)*/
public class GeneircObjectToolDemo2 {
    public static void main(String[] args) {
            ObjectToolDemo2 ot =new ObjectToolDemo2();
            ot.show("hello");
            ot.show(100);
            ot.show(true);
    }
}

class ObjectToolDemo2{
//    这样就可以任意传递类型的参数了
    public <T> void show(T t){
        System.out.println(t);
    }
}
