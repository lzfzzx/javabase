package RunnableDemo;

/**
 * Created by Lzf on 2018/10/9.
 */
/*方式2：实现Runnable接口
步骤：
A:自定义类MyRunnable实现Runnable接口
B:重写run()方法
C:创建MyRunnable类的对象
D:创建Thread类的对象，并把C步骤的对象作为构造参数传递*/
public class RunnableDemo {
    public static void main(String[] args) {
//        创建对象
        MyRunnable my = new MyRunnable();
//        创建Thread类的对象，并把C步骤的对象座位构造参数传递
        Thread t1 = new Thread(my,"葫芦娃");
        Thread t2 = new Thread(my,"救爷爷");

        t1.start();
        t2.start();

    }
}

class  MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
//            由于实现接口的方式就不能直接使用Thread类的方法了,但可以间接使用
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}