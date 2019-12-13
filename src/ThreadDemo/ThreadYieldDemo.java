package ThreadDemo;

/**
 * Created by Lzf on 2018/10/9.
 */
/*public static void yield()：线程礼让*/
public class ThreadYieldDemo {
    public static void main(String[] args) {
        ThreadYield ty1 = new ThreadYield();
        ThreadYield ty2 = new ThreadYield();
        ty1.setName("葫芦娃");
        ty2.setName("救爷爷");
        ty1.start();
        ty2.start();
    }
}
class ThreadYield extends Thread{
    @Override
    public void run(){
        for (int i = 0; i <100 ; i++) {
            System.out.println(getName()+":"+i);
            Thread.yield();
        }
    }
}
/*这个方法暂停当前正在执行的线程对象，并执行其他线程。
让多个线程的执行更和谐，但是不能靠它保证一人一次。*/