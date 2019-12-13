/**
 * Created by Lzf on 2018/10/8.
 */
/*递归
递归
方法定义中调用方法本身的现象
学习递归呢，我们要一定要学习他解决问题的思想
递归解决问题的思想
做递归要写一个方法
找到出口条件
找到规律
  递归的注意事项
  递归一定要有出口，否则就是死递归
  递归的次数不能太多，否则就内存溢出
  构造方法不能递归使用
  下面我们来做个小练习吧。用代码实现求5的阶乘。*/
//循环实现和递归实现
public class DiGuiDemo {
    public static void main(String[] args) {
//        循环
        int a = 1;
        for (int i = 2; i <6 ; i++) {
            a*=i;
        }
        System.out.println("5的阶乘："+a);
        System.out.println("5的阶乘："+jiecheng(5));
    }
    /*做递归要写一个方法：
        返回值类型：int
        参数列表：int n
        出口条件：
            if(n==1){return 1;}
        规律：
            if(n!=1){return n*方法名（n-1）;}
    * */
    public static int jiecheng(int n){
        if (n==1){
            return 1;
        }
        else {
            return n*jiecheng(n-1);
        }

    }

}
