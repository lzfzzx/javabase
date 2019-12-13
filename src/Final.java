/**
 * Created by Lzf on 2018/9/19.
 */
/*final关键字

final关键字是最终的意思，可以修饰类，成员变量，成员方法。
修饰类，类不能被继承
修饰变量，变量就变成了常量，只能被赋值一次
修饰方法，方法不能被重写 */
public class Final {
    public static void main(String[] args) {
        Son son =new Son();
        son.show();
    }

}

class Father{
    int num = 10;
    final int num2 = 20;
   /* public final void show(){

    }*/

}

class Son extends Father{
    public void show(){
        num = 100;
        System.out.println(num);
//        num2 = 200;
        System.out.println(num2);
    }
}
