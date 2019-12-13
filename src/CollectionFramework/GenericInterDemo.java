package CollectionFramework;

/**
 * Created by Lzf on 2018/9/30.
 */
/*泛型接口
把泛型定义在接口上
格式:public interface 接口名<泛型类型1…>*/
interface Inter<T>{
    public abstract  void show(T t);
}
//实现接口时，会遇到两种情况
//第一种：已经知道是什么类型的了
class InterImpl implements Inter<String>{
    @Override
    public void show(String t){
        System.out.println(t);
    }
}
//第二种：还不知道是什么类型的
class InterImpls<T> implements Inter<T>{
    @Override
    public void show(T t){
        System.out.println(t);
    }
}
public class GenericInterDemo {
    public static void main(String[] args) {
//        第一种测试
        Inter<String> i = new InterImpl();
        i.show("hello");
//        第二种测试
        Inter<String> i1 = new InterImpls<String>();
        i.show("hello");
        Inter<Integer> i2 = new InterImpls<Integer>();
        i2.show(100);

    }
}