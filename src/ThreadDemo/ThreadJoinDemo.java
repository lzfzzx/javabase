package ThreadDemo;

/**
 * Created by Lzf on 2018/10/9.
 */
//public final void join();线程加入，等待该线程终止
public class ThreadJoinDemo {
    public static void main(String[] args) {
        ThreadJoin tj1 = new ThreadJoin();
        ThreadJoin tj2 = new ThreadJoin();
        ThreadJoin tj3 = new ThreadJoin();
        tj1.setName("中秋节");
        tj2.setName("国庆节");
        tj3.setName("圣诞节");
        tj1.start();
        try {
            tj1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tj2.start();
        tj3.start();
    }
}

class ThreadJoin extends Thread{
    @Override
    public void run(){
        for (int i = 0; i <100 ; i++) {
            System.out.println(getName()+":"+i);

        }
    }

}
/*运行程序，我们发现名字为中秋节的线程走完了之后才开始走下面的两个线程。
给那个线程用这个方法就是等待该线程终止后，再继续执行接下来的线程。*/