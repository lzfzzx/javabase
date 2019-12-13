package ThreadDemo;

/**
 * Created by Lzf on 2018/10/9.
 */
/*获取和设置线程名称
Thread类的基本获取和设置方法
public final String getName():获取线程的名称。
public final void setName(String name):设置线程的名称*/
public class ThreadDemo2 extends Thread {
    public static void main(String[] args) {
//            创建线程对象
//        无参构造
        MyThread2 my1 = new MyThread2();
        MyThread2 my2 = new MyThread2();
        my1.setName("葫芦娃");
        my2.setName("救爷爷");
        my1.start();
        my2.start();

        //带参构造方法给线程起名字
        // MyThread my1 = new MyThread("阿杜");
        // MyThread my2 = new MyThread("杜鹏程");
        // my1.start();
        // my2.start();

        //我们可以使用无参构造的方法，也可以使用带参构造的方法

/*但是我们要获取main方法所在的线程对象的名称，该怎么办呢?
  遇到这种情况,Thread类提供了一个很好玩的方法:
  public static Thread currentThread():返回当前正在执行的线程对象

  System.out.println(Thread.currentThread().getName());
  这句话如果在main中执行，就会输出main。会返回当前执行的线程对象
*/
        System.out.println(Thread.currentThread().getName());

    }
}

class MyThread2 extends Thread{
    public MyThread2(){

    }
    public MyThread2(String name){
        super(name);

    }
    @Override
    public void run(){
        for (int i = 0; i <100 ; i++) {
            System.out.println(getName()+":"+i);
        }
    }
}
