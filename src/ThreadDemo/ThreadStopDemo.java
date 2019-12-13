package ThreadDemo;

import java.util.Date;

/**
 * Created by Lzf on 2018/10/9.
 */
/*public final void stop()：中断线程
public void interrupt()：中断线程

这两个方法都是中断线程的意思，但是他们还是有区别的,我们来一起研究一下*/
public class ThreadStopDemo {
    public static void main(String[] args) {
        ThreadStop ts = new ThreadStop();
        ts.start();
//        你超过3秒不醒来我就干死你
        try {
            Thread.sleep(3000);
//            ts.stop();
            ts.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class ThreadStop extends Thread{
    @Override
    public void run(){
        System.out.println("开始执行："+new Date());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
//            e.printStackTrace();
            System.out.println("线程被终止了");
        }
        System.out.println("结束执行："+new Date());
    }
}
/*我们可以发现stop（）方法执行后，该线程就停止了，不再继续执行了
但是interrupt（）方法执行后，它会终止线程的状态，还会继续执行run方法里面的代码。*/