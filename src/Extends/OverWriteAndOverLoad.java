package Extends;

/**
 * Created by Lzf on 2018/9/19.
 */
/*方法重写、方法重载
方法重写概述
子类中出现了和父类中一模一样的方法声明，也被称为方法覆盖，方法复写。
方法重载概述
本类中出现的方法名一样，参数列表不同的方法。与返回值无关。
使用特点：
如果方法名不同，就调用对应的方法
如果方法名相同，最终使用的是子类自己的
方法重写的应用：
当子类需要父类的功能，而功能主体子类有自己特有内容时，可以重写父类中的方法，这样，即沿袭了父类的功能，又定义了子类特有的内容。*/
public class OverWriteAndOverLoad {
    public static void main(String[] args) {
        NewPhone newPhone =new NewPhone();
        newPhone.call("儿子");
    }

}
class Phone{
    public void call(String name){
        System.out.println("给"+name+"打电话");
    }
}

class NewPhone extends Phone{
    public void call(String name){
        super.call(name);
        System.out.println("打完了，做其他事情");
    }
}
/*方法重写的注意事项
A:父类中私有方法不能被重写（因为父类私有方法子类根本就无法继承）
B:子类重写父类方法时（访问权限不能更低，最好就一致）
C:父类静态方法，子类也必须通过静态方法进行重写
子类重写父类方法的时候，最好声明一模一样。*/

/*方法重写（Override）和方法重载（Overload）的区别?方法重载能改变返回值类型吗?

方法重写：在子类中，出现和父类中一模一样的方法声明的现象。
方法重载：同一个类中，出现的方法名相同，参数列表不同的现象。

方法重载能改变返回值类型，因为它和返回值类型无关。

this关键字和super关键字分别代表什么?以及他们各自的使用场景和作用。

this:代表当前类的对象引用
super:代表父类存储空间的标识。(可以理解为父类的引用，通过这个东西可以访问父类的成员)
场景：
成员变量：this.成员变量——super.成员变量
构造方法：this(…)——super(…)
成员方法：this.成员方法——super.成员方法*/


